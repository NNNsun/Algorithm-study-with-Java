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

		printf("����� ����մϴ�.\n");
		FILE* output;
		fopen_s(&output, ".\\output.txt", "w");

		printf("�����...\n");

		fprintf(output, "\tA\tB\tC\t�̹���\t�б�\n");
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

		printf("�� ������Ʈ ������ output.txt ���Ϸ� ��µ�.\n");
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
// ������ ���ϴ� �Լ�
int addStudents(int sch_x, int sch_y, int std_x, int std_y) {
	int rr = (sch_x - std_x) * (sch_x - std_x) + (sch_y - std_y) * (sch_y - std_y);
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
	static int situation[3][10000];
	// �л����� ���� ���¸� ���� 1:�߰ߵ� �Ǵ� �ߺ�x 2:�ߺ�
	static int state[10000] = { 0, };
	for (int i = 0; i < 10000; i++)
		state[i] = 0;

	// ���� �� �б��� ������ �л���
	int countStd[3] = { 0, };

	//<�߰�> �ű��л� ����
	int top[3];
	


	// ������
	int R = 0;

	// ������ Ű���
	while (R++ < 1414) {
		//�ű��л� -1�� �ʱ�ȭ
		for (int i = 0; i < 3; i++)
			top[i] = -1;
		// N��°�б��� ��ġ�� �����ǰ�, n��° �л��� ��ġ�� �˷��ִ� �κ�
		for (int i = 0; i < 3; i++) {
			// �б� ��ġ
			get_school_position(i, &sch_x, &sch_y);


			// n��°�л��� ��ġ�� �˷��ش�
			for (int j = 0; j < 10000; j++) {

				get_student_position(j, &std_x, &std_y);

				// �����ȿ� �������
				if (R * R >= addStudents(sch_x, sch_y, std_x, std_y)) {
					// ������ �л��� �ƴҰ��
					if (state[j] > -1) {
						//������ ���� ������Ų�� ����ϱ⶧���� ���ʿ� ++�� �ٿ��ش�
						situation[i][++top[i]] = j;
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
				for (int k = 0; k <= top[j]; k++) {
					// 1. �ߺ��� �ƴ� ���
					if (state[situation[i][k]] == 1) {
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
						get_student_position(situation[i][k], &std_x, &std_y);
						int MAX_SCHOOL_DISTANCE = 2000 * 2000; // ���� : �츮�� �ٷ�� �������� �ִ�Ÿ����� �� ���
						// �� �б����� ���� �л����� �Ÿ��� ���� �迭
						int distance[3];
						// �б��� �Ÿ� �������� (���ÿ� �ּҰŸ��� �б��� �ε����� �˾Ƴ���)
						int minDistanceSchool = 0;
						for (int z = 0; z < 3; z++) {
							// �б� ��ġ ��������
							get_school_position(z, &sch_x, &sch_y);
							// ���� �б��� �Ÿ�(�ְ� ����) �����ϱ�
							if (countStd[z] == limit)
								// 1. ������ �� �� �б��� �Ÿ� �ְ�
								distance[z] = MAX_SCHOOL_DISTANCE;
							else {
								int tempDistance = addStudents(sch_x, sch_y, std_x, std_y);
								if (R * R < tempDistance)
									// 2. ���� �� �л��� �߰����� ���� �б��� �Ÿ� �ְ�
									distance[z] = MAX_SCHOOL_DISTANCE;
								else
									// 3. �� �л��� �߰��� �б��ε� ������ �������� �Ÿ� ����� �ݿ�
									distance[z] = addStudents(sch_x, sch_y, std_x, std_y);
							}
							// ��� ���캻 �б��� �ּҰŸ�����?? Ȯ���ϱ�
							if (distance[minDistanceSchool] > distance[z])
								minDistanceSchool = z;
						}
						// ������ �� �ִ� �б��� ������
						if (distance[minDistanceSchool] <= R * R) {
							// �����ϰ�
							set_student_school(situation[i][k], minDistanceSchool);
							state[situation[i][k]] = -1;
							countStd[minDistanceSchool]++;
						}
						// ������ �� ������
						else
							// �̹߰� ���·� �ǵ�����
							state[situation[i][k]] = 0;
					}
				}
				// ������ ������ ���̻� ������ �ø����ʰ� ������.
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