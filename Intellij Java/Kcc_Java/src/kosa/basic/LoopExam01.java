package kosa.basic;

public class LoopExam01 {

	public static void main(String[] args) {
//		//while : �ʱ�� -> ���ǽ� -> ��ɹ� -> ������ : ���� ����
//		//1~10���� ��
//		int sum = 0;
//		
//		int i = 1;
//		
//		while (i<=10) {
//			sum += i;
//			i++;
//		}
//		System.out.println("1~10���� �� : " + sum);
		
		
//		int i = 1;  //������ 7��
//		
//		while(i <=9) {
//			//sum = 7 *  i;
//			System.out.println("7 * " + i + "=" + (7*i));
//			i++;
//		}
//	}
	
//		//for �� : �ʱ�� -> ���ǽ� -> ����� -> ������ : ���� ����
//		int sum = 0;
//		for(int i = 1; i<=10; i++) {
//			sum += i;
//		}
//		System.out.println("1~10������ ��" + sum);
//	}
		
//		//����> 1~100���� 2�� ����� 3�� ����� �ƴ� ���ڸ� ����Ͻÿ�.
//		
//		for(int i = 1; i <=100; i++) {
//			if(i % 2!= 0 && i % 3!=0) {
//				System.out.print(" " + i);
//			}
//		}
//		
//		System.out.println();
//		
//		for(int i = 1; i <=100; i++) {
//			if(i % 2== 0 || i % 3 ==0) {
//				continue;
//			}
//			System.out.print(" " + i);
//		}
		
		// do~while : ��ɹ��� 1���� �����ؾ� �ϴ� ���
		// Ű����� ���� ���ڸ� �Է� �ޱ�
		//������ �Է��ϸ� ���� �Է� �޵��� �ϱ� ����
		
//		
//		Scanner sc = new Scanner(System.in);
//		
//		int n = 0;
//		
//		do {
//			System.out.print("�Է� : ");
//			n = sc.nextInt();
//		}while(n<0);
//		
//		System.out.println("�Է� ��� : " + n);
		
		//����> 2���� ������ �Է� �޾� b-a ��� �������.
		// b>a �ǵ��� �Է� => a��b���� ũ�� ���� �Է� �޵��� ����.
		
//		int a = 0, b = 0;
//		
//		Scanner sc = new Scanner(System.in);
//		
//		do {
//			System.out.print("�Է� 1 : ");
//			a = sc.nextInt();
//			System.out.print("�Է� 2: ");
//			b = sc.nextInt();
//			
//		} while(b>a);
//		
//		System.out.println("b-a�� ���� : " + (b-a));
		
		//���� 3 > ������ ���� 3�� �޾Ƽ� ���� ��ø���� �ʰ� ����ϱ�
//		int n = (int)(Math.random()*9) + 1;
//		System.out.println(n);
		
		int n1, n2, n3;
		
		do {
			n1 = (int)(Math.random()*9) + 1;
			n2 = (int)(Math.random()*9) + 1;
			n3 = (int)(Math.random()*9) + 1;
		}while ((n1==n2) || (n2==n3) || (n1==n3));
		System.out.println(n1 + " " + n2 + " " + n3);
	}
}
