package com.biz.method;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.method.vo.GradeVO;

public class Method02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//GradeVO gradeVO = new GradeVO();
		List<GradeVO> grades = new ArrayList();
		for(int i = 0 ; i < 3; i++) {
			
			System.out.println("������ġ");
			GradeVO gradeVO = new GradeVO();
			//if(makeScore(gradeVO) == false){ �Ʒ��� ���� �ǹ�
			if(!makeScore(gradeVO));{
				//makeScore�� ����Ǵ� ���� ������ �߻��ϸ�
				//false�� return�� ���̰�, i ���� 1�� ������ ���� 
				//�ٽ� for�� �ǵ��ư��� ���� �л��� ������ �ٽ� �Է¹޵��� �õ�
				i--;
				continue;
			}
			//makeScore�� ���������� ����Ǽ� ���� true�� return�Ѱ�쿡��
			//List�� �ϳ� �߰� 
			grades.add(gradeVO);			
		}
	}
		


	

	public static boolean makeScore(GradeVO gradeVO) {
		Scanner scanner = new Scanner(System.in);
		boolean retOk = true;
		
		System.out.print("�й� >>");
		String strNum = scanner.nextLine();
		
		System.out.print("�̸� >>");
		String strName = scanner.nextLine();
		
		System.out.print("���� >>");
		String strKor = scanner.nextLine();
		
		System.out.print("���� >>");
		String strEng = scanner.nextLine();
		
		System.out.print("���� >>");
		String strMath = scanner.nextLine();
		
		try {
			gradeVO.setIntKor(Integer.valueOf(strKor));
			gradeVO.setIntEng(Integer.valueOf(strEng));
			gradeVO.setIntMath(Integer.valueOf(strMath));
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("�������� ���� ����");
			retOk = false ;
		
	}
		return retOk;
}
}
