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


	int A[3][10000];
	int B[10000] = { 0, };
	int count[3] = { 0, };
	
	
	int topA = 0;//인덱스값
	int topB = 0;
	int topC = 0;

	// 반지름
	 int R=0;
	 
	//반지름 키우기
	while (R++ < 2000) {
		//N번째학교의 위치가 결정되고, n번째 학생의 위치를 알려주는 부분
		for (int i = 0; i < 3; i++) {
			// 학교 위치
			get_school_position(i, &sch_x, &sch_y);


			//n번째학생의 위치를 알려준다
			for (int j = 0; j < 10000; j++) {
				
				get_student_position(i, &std_x, &std_y);

				//범위안에 있을경우
				if (R * R > addStudents(sch_x, sch_y, std_x, std_y, R)) {
					//배정된 학생이 아닐경우
					if (B[j] != -1) {
						A[i][j] = j;
						if (B[j] = 1) B[j] = 2; //중복표시
						else if (B[j] = 0) B[j] = 1; //발견됨
					}

				}
				
			}

		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 10000; j++) {
					if (B[A[i][j]] != 2) {
						//3500명이 아닐때
						if (count[i] != limit) {
							set_student_school(A[i][j], i);
							count[i]++;
						}else 
							if(count[++i])n
					}
				


			}
		}



		
	}


}
//rr을 구하는 함수
double addStudents(int sch_x, int sch_y, int std_x, int std_y,int R) {

	double rr =(sch_x - std_x) * (sch_x - std_x) + (sch_y - std_x) * (sch_y - std_x);
	
	return rr;
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

	return;
}
