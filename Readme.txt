//���� ���� �޴��� �ʿ��� DB
CREATE TABLE MyAppointments(
	aid VARCHAR(11),
	acontent VARCHAR(100),
	adate DATE,
	alocation VARCHAR(100),
	apersons VARCHAR(100),
	primary key(aid) );

//JUNIT �׽�Ʈ�� �����ϱ� ���ؼ��� ��� 1�� �̻��� �����Ͱ� �ʿ��մϴ�.
-�׽�Ʈ�� ������
insert into MyAppointments values('201812211','c1','18/12/21','l1','p1');