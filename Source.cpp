//test
#include <stdio.h>
#include <stdlib.h>
//
static int process(int command, int param1, int param2)
{
	static int school[3][3];
	static int student[10000][3];

	int counter;

	switch (command)
	{
	case 1: return (school[param1][0]);
	case 2: return (school[param1][1]);
	case 3: return (student[param1][0]);
	case 4: return (student[param1][1]);
	case 5: student[param1][2] = param2; return (0);
	}

	if (command == 0)
	{
		for (counter = 0; counter < 3; counter++)
		{
			school[counter][0] = rand() % 1000;
			school[counter][1] = rand() % 1000;
		}

		for (counter = 0; counter < 10000; counter++)
		{
			student[counter][0] = rand() % 1000;
			student[counter][1] = rand() % 1000;
			student[counter][2] = -1;
		}

		return (0);
	}
	//test
	if (command == 6) {

		printf("결과를 출력합니다.\n");
		FILE* output;
		fopen_s(&output, ".\\output.txt", "w");

		printf("출력중...\n");

		fprintf(output, "\tA\tB\tC\t미배정\t학교\n");
		for (int i = 0; i < 3; i++)
			fprintf(output, "%d\t\t\t\t\t%d\n", school[i][0], school[i][1]);
		for (int i = 0; i < 10000; i++) {
			fprintf(output, "%d\t", student[i][0]);
			if (student[i][2] == -1)
				fprintf(output, "\t\t\t");
			else
				for (int j = 0; j < student[i][2]; j++)
					fprintf(output, "\t");
			fprintf(output, "%d\n", student[i][1]);
		}

		fclose(output);

		printf("이 프로젝트 폴더의 output.txt 파일로 출력됨.\n");
	}
	//
	return (-1);
}


void get_school_position(int school_index, int* posX, int* posY)
{
	if ((0 <= school_index) && (school_index < 3))
	{
		*posX = process(1, school_index, 0);
		*posY = process(2, school_index, 0);
	}
	else
	{
		*posX = -1;
		*posY = -1;
	}

	return;
}


void get_student_position(int student_index, int* posX, int* posY)
{
	if ((0 <= student_index) && (student_index < 10000))
	{
		*posX = process(3, student_index, 0);
		*posY = process(4, student_index, 0);
	}
	else
	{
		*posX = -1;
		*posY = -1;
	}

	return;
}


void set_student_school(int student_index, int school_index)
{
	if ((0 <= student_index) && (student_index < 10000) && (0 <= school_index) && (school_index < 3))
	{
		process(5, student_index, school_index);
	}

	return;
}
// 범위을 구하는 함수
int addStudents(int sch_x, int sch_y, int std_x, int std_y) {
	int rr = (sch_x - std_x) * (sch_x - std_x) + (sch_y - std_y) * (sch_y - std_y);
	return rr;
}


void run_contest(void) {
	// 학교 좌표
	int sch_x;
	int sch_y;
	// 학생 좌표
	int std_x;
	int std_y;
	// 학교 수용 최대 인원
	int limit = 3500;

	// 각 학교마다 범위 안에 있는 학생들 현황
	static int situation[3][10000];
	// 학생들의 배정 상태를 저장 1:발견됨 또는 중복x 2:중복
	static int state[10000] = { 0, };
	for (int i = 0; i < 10000; i++)
		state[i] = 0;

	// 현재 각 학교에 배정된 학생수
	int countStd[3] = { 0, };

	//<추가> 신규학생 스택
	int top[3];
	


	// 반지름
	int R = 0;

	// 반지름 키우기
	while (R++ < 1414) {
		//신규학생 -1로 초기화
		for (int i = 0; i < 3; i++)
			top[i] = -1;
		// N번째학교의 위치가 결정되고, n번째 학생의 위치를 알려주는 부분
		for (int i = 0; i < 3; i++) {
			// 학교 위치
			get_school_position(i, &sch_x, &sch_y);


			// n번째학생의 위치를 알려준다
			for (int j = 0; j < 10000; j++) {

				get_student_position(j, &std_x, &std_y);

				// 범위안에 있을경우
				if (R * R >= addStudents(sch_x, sch_y, std_x, std_y)) {
					// 배정된 학생이 아닐경우
					if (state[j] > -1) {
						//스택은 먼저 증가시킨후 사용하기때문에 앞쪽에 ++을 붙여준다
						situation[i][++top[i]] = j;
						// 1:발견됨, 끝까지 1로 남는 경우 차질없이 배정됨
						if (state[j] == 0) state[j] = 1;
						// 2:중복, 이미 다른 학교로 배정되어있지만 같은 거리에 거주중이므로 분류가 필요한 상태
						else if (state[j] == 1) state[j] = 2;
					}
				}
			}
		}
		// 각 학교에 학생들을 배정하는 과정
		//학교접근 situation 증가
		for (int i = 0; i < 3; i++) {
			//학교별 top값 접근
			for (int j = 0; j < 3; j++) {
				//학교별 스택 접근
				for (int k = 0; k <= top[j]; k++) {
					// 1. 중복이 아닌 경우
					if (state[situation[i][k]] == 1) {
						// 정원이 가득찬 경우 -> 정원이 남은 다른 학교가 발견하도록 '발견전' 상태로 만들어줌
						if (countStd[i] > limit) {
							state[situation[i][k]] = 0;
						}
						// 정원이 차지 않은 경우 -> 배정표시를 해준다, '-1'로 약속
						else {
							set_student_school(situation[i][k], i);
							state[situation[i][k]] = -1;
							countStd[i]++;
						}
					}

					// 2.중복인 경우, 두개 이상의 레이더에 걸린 경우, 거리가 상의할수 있음
					if (state[situation[i][k]] == 2) {
						// 중복된 거리에 거주하는 학생의 위치
						get_student_position(situation[i][k], &std_x, &std_y);
						int MAX_SCHOOL_DISTANCE = 2000 * 2000; // 기준 : 우리가 다루는 지도상의 최대거리보다 더 길게
						// 각 학교마다 현재 학생과의 거리를 담을 배열
						int distance[3];
						// 학교별 거리 가져오기 (동시에 최소거리인 학교의 인덱스도 알아내기)
						int minDistanceSchool = 0;
						for (int z = 0; z < 3; z++) {
							// 학교 위치 가져오기
							get_school_position(z, &sch_x, &sch_y);
							// 현재 학교의 거리(왜곡 가능) 저장하기
							if (countStd[z] == limit)
								// 1. 정원이 다 찬 학교를 거리 왜곡
								distance[z] = MAX_SCHOOL_DISTANCE;
							else {
								int tempDistance = addStudents(sch_x, sch_y, std_x, std_y);
								if (R * R < tempDistance)
									// 2. 아직 이 학생을 발견하지 못한 학교를 거리 왜곡
									distance[z] = MAX_SCHOOL_DISTANCE;
								else
									// 3. 이 학생을 발견한 학교인데 정원도 남았으면 거리 제대로 반영
									distance[z] = addStudents(sch_x, sch_y, std_x, std_y);
							}
							// 방금 살펴본 학교가 최소거리였나?? 확인하기
							if (distance[minDistanceSchool] > distance[z])
								minDistanceSchool = z;
						}
						// 배정할 수 있는 학교가 있으면
						if (distance[minDistanceSchool] <= R * R) {
							// 배정하고
							set_student_school(situation[i][k], minDistanceSchool);
							state[situation[i][k]] = -1;
							countStd[minDistanceSchool]++;
						}
						// 배정할 수 없으면
						else
							// 미발견 상태로 되돌리기
							state[situation[i][k]] = 0;
					}
				}
				// 배정이 끝나면 더이상 범위를 늘리지않고 끝낸다.
				if (countStd[0] + countStd[1] + countStd[2] >= 10000)
					break;
			}
		}
	}
}



void main(void)
{
	char* idname(void);

	int counter;

	srand(3);
	for (counter = 0; counter < 10; counter++)
	{
		process(0, 0, 0);
		run_contest();
	}
	//test
	process(6, 3, 5);
	//
	return;
}