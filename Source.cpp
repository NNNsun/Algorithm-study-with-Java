extern int srand(unsigned int);
extern int rand(void);


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
	int situation[3][10000];
	// 학생들의 배정 상태를 저장 1:발견됨 또는 중복x 2:중복
	int state[10000] = { 0, };

	// 현재 각 학교에 배정된 학생수
	int countStd[3] = { 0, };

	// 반지름
	int R = 0;

	// 반지름 키우기
	while (R++ < 2000) {
		// N번째학교의 위치가 결정되고, n번째 학생의 위치를 알려주는 부분
		for (int i = 0; i < 3; i++) {
			// 학교 위치
			get_school_position(i, &sch_x, &sch_y);


			// n번째학생의 위치를 알려준다
			for (int j = 0; j < 10000; j++) {

				get_student_position(i, &std_x, &std_y);

				// 범위안에 있을경우
				if (R * R > addStudents(sch_x, sch_y, std_x, std_y, R)) {
					// 배정된 학생이 아닐경우
					if (state[j] > -1) {
						situation[i][j] = j;
						// 1:발견됨, 끝까지 1로 남는 경우 차질없이 배정됨
						if (state[j] = 0) state[j] = 1;
						// 2:중복, 이미 다른 학교로 배정되어있지만 같은 거리에 거주중이므로 분류가 필요한 상태
						else if (state[j] = 1) state[j] = 2;
					}
				}
			}
		}
		// 각 학교에 학생들을 배정하는 과정
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 10000; j++) {
				// 1. 중복이 아닌 경우
				if (state[situation[i][j]] == 1) {
					// 정원이 가득찬 경우 -> 가장 적은 학생 수를 가진 학교를 찾아 학생을 배정함
					if (countStd[i] > limit) {
						if (countStd[0] <= countStd[1]) {
							set_student_school(situation[i][j], 0);
							countStd[0]++;
						}
						else {
							set_student_school(situation[i][j], 1);
							countStd[1]++;
						}

						if (countStd[0] <= countStd[2]){ 
							set_student_school(situation[i][j], 0);
							countStd[0]++;
						}
						else {
							set_student_school(situation[i][j], 2);
							countStd[2]++;
						}
						if (countStd[1] <= countStd[2]) {
							set_student_school(situation[i][j], 1);
							countStd[1]++;
						}
						else {
							set_student_school(situation[i][j], 2);
							countStd[2]++;
						}
						if (countStd[0] <= countStd[1] && countStd[0] <= countStd[2]) {
							set_student_school(situation[i][j], 0);
							countStd[0]++;
						}
						else if (countStd[1] <= countStd[0] && countStd[0] <= countStd[2]) {
							countStd[1]++;
						}
						else if (countStd[2] <= countStd[0] && countStd[2] <= countStd[1]) {
							countStd[2]++;
						}
					}
					// 정원이 차지 않은 경우
					else {
						set_student_school(situation[i][j], i);
						countStd[i]++;
					}
				}

				// 2.중복인 경우(거리가 같을 경우): 인원수가 적은 학교에 배정한다
				if (state[situation[i][j]] == 2) {
					// 중복된 거리에 거주하는 학생의 위치
					get_student_position(i, &std_x, &std_y);
					double temp[3] = { 0, };

					// 학생으로부터 각 학교마다 떨어진 거리를 구함(중복된 학교들을 찾기위한 과정)
					for (int k = 0; k < 3; k++) {
						get_school_position(k, &sch_x, &sch_y);
						
						temp[k] = addStudents(sch_x, sch_y, std_x, std_y, R);
					}
					// 가장 학생수가 적은 학교에 배정
					if (temp[0] == temp[1]) {
						if (countStd[0] <= countStd[1])
							countStd[0]++;
						else countStd[1]++;
					}
					else if (temp[0] == temp[2]) {
						if (countStd[0] <= countStd[2])
							countStd[0]++;
						else countStd[2]++;
					}
					else if (temp[1] == temp[2]) {
						if (countStd[1] <= countStd[2])
							countStd[1]++;
						else countStd[2]++;
					}
					else if (temp[0] == temp[1] && temp[0] == temp[2]) {
						if (countStd[0] <= countStd[1] && countStd[0] <= countStd[2])
							countStd[0]++;
						else if (countStd[1] <= countStd[0] && countStd[0] <= countStd[2])
							countStd[1]++;
						else if (countStd[2] <= countStd[0] && countStd[2] <= countStd[1])
							countStd[2]++;
					}
				}
			}
		}
		// 배정이 끝나면 더이상 범위를 늘리지않고 끝낸다.
		if (countStd[0] + countStd[1] + countStd[2] >= 10000)
			break;
	}
}
// 범위을 구하는 함수
double addStudents(int sch_x, int sch_y, int std_x, int std_y, int R) {
	double rr = (sch_x - std_x) * (sch_x - std_x) + (sch_y - std_x) * (sch_y - std_x);
	return rr;
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

	return;
}
