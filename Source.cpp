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
// ������ ���ϴ� �Լ�
int addStudents(int sch_x, int sch_y, int std_x, int std_y) {
	int rr = (sch_x - std_x) * (sch_x - std_x) + (sch_y - std_x) * (sch_y - std_x);
	return rr;
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

	// �� �б����� ���� �ȿ� �ִ� �л��� ��Ȳ
	int situation[3][10000];
	// �л����� ���� ���¸� ���� 1:�߰ߵ� �Ǵ� �ߺ�x 2:�ߺ�
	int state[10000] = { 0, };

	// ���� �� �б��� ������ �л���
	int countStd[3] = { 0, };

	//<�߰�> �ű��л� ����
	int top[3] = { -1 , };


	// ������
	int R = 0;

	// ������ Ű���
	while (R++ < 1414) {
		// N��°�б��� ��ġ�� �����ǰ�, n��° �л��� ��ġ�� �˷��ִ� �κ�
		for (int i = 0; i < 3; i++) {
			// �б� ��ġ
			get_school_position(i, &sch_x, &sch_y);


			// n��°�л��� ��ġ�� �˷��ش�
			for (int j = 0; j < 10000; j++) {

				get_student_position(i, &std_x, &std_y);

				// �����ȿ� �������
				if (R * R >= addStudents(sch_x, sch_y, std_x, std_y)) {
					// ������ �л��� �ƴҰ��
					if (state[j] > -1) {
						situation[i][top[i]++] = j;
						// 1:�߰ߵ�, ������ 1�� ���� ��� �������� ������
						if (state[j] == 0) state[j] = 1;
						// 2:�ߺ�, �̹� �ٸ� �б��� �����Ǿ������� ���� �Ÿ��� �������̹Ƿ� �з��� �ʿ��� ����
						else if (state[j] == 1) state[j] = 2;
					}
				}
			}
		}
		// �� �б��� �л����� �����ϴ� ����
		//�б����� situation ����
		for (int i = 0; i < 3; i++) {
			//�б��� top�� ����
			for (int j = 0; j < 3; j++) {
				//�б��� ���� ����
				for (int k = 0; k < top[j]; k++) {
					// 1. �ߺ��� �ƴ� ���
					if (state[situation[i][j]] == 1) {
						// ������ ������ ��� -> ������ ���� �ٸ� �б��� �߰��ϵ��� '�߰���' ���·� �������
						if (countStd[i] > limit) {
							state[situation[i][k]] = 0;
						}
						// ������ ���� ���� ��� -> ����ǥ�ø� ���ش�, '-1'�� ���
						else {
							set_student_school(situation[i][k], i);
							state[situation[i][k]] = -1;
							countStd[i]++;
						}
					}

					// 2.�ߺ��� ���, �ΰ� �̻��� ���̴��� �ɸ� ���, �Ÿ��� �����Ҽ� ����
					if (state[situation[i][k]] == 2) {
						// �ߺ��� �Ÿ��� �����ϴ� �л��� ��ġ
						get_student_position(i, &std_x, &std_y);
						//�л����� �� �б����� �Ÿ��� ���� �迭
						double temp[3] = { 0, };
						int tmpCount = 100000;
						// �л����κ��� �� �б����� ������ �Ÿ��� ����(�ߺ��� �б����� ã������ ����)
						for (int z = 0; z < 3; z++) {
							get_school_position(k, &sch_x, &sch_y);

							temp[z] = addStudents(sch_x, sch_y, std_x, std_y);
							//������ �Ѵ� �б��� ��� �л��� ��ġ�� ��� �̵����� �̹� ���̴��� �ɸ��� �ʰ� �Ѵ�
							if (countStd[z] > limit) {
								temp[z] = R * R + 1;
								state[situation[i][k]] = 0;
							}
							else
								if (tmpCount >= temp[z]) {
									tmpCount = temp[z];
								}
						}
						for (int y = 0; y < 3; y++) {
							if (temp[y] == tmpCount) {
								int stdMin = 3500;
								for (int u = 0; u < 3; u++) {
									if (stdMin > countStd[u])
										stdMin = countStd[u];
								}
								if (countStd[y] == stdMin) {
									set_student_school(situation[i][k], y);
									state[situation[i][k]] = -1;
									countStd[i]++;
								}

							}
						}

					}
				}
			}
			// ������ ������ ���̻� ������ �ø����ʰ� ������.
			if (countStd[0] + countStd[1] + countStd[2] >= 10000)
				break;
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

	return;
}