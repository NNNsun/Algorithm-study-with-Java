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
	// �б� ��ǥ
	int sch_x;
	int sch_y;
	// �л� ��ǥ
	int std_x;
	int std_y;
	// �б� ���� �ִ� �ο�
	int limit = 3500;


	int A[3][10000];
	int B[10000] = { 0, };
	int count[3] = { 0, };
	
	
	int topA = 0;//�ε�����
	int topB = 0;
	int topC = 0;

	// ������
	 int R=0;
	 
	//������ Ű���
	while (R++ < 2000) {
		//N��°�б��� ��ġ�� �����ǰ�, n��° �л��� ��ġ�� �˷��ִ� �κ�
		for (int i = 0; i < 3; i++) {
			// �б� ��ġ
			get_school_position(i, &sch_x, &sch_y);


			//n��°�л��� ��ġ�� �˷��ش�
			for (int j = 0; j < 10000; j++) {
				
				get_student_position(i, &std_x, &std_y);

				//�����ȿ� �������
				if (R * R > addStudents(sch_x, sch_y, std_x, std_y, R)) {
					//������ �л��� �ƴҰ��
					if (B[j] != -1) {
						A[i][j] = j;
						if (B[j] = 1) B[j] = 2; //�ߺ�ǥ��
						else if (B[j] = 0) B[j] = 1; //�߰ߵ�
					}

				}
				
			}

		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 10000; j++) {
					if (B[A[i][j]] != 2) {
						//3500���� �ƴҶ�
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
//rr�� ���ϴ� �Լ�
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
