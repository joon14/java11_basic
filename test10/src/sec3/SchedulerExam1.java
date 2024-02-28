package sec3;

import java.io.IOException;

public class SchedulerExam1 {
	public static void main(String[] args) throws IOException {
		//키보드로 알파벳[A~Z]를 입력받아 입력 값이 'R' 이면, RoundRobin 의 객체가
		//'L' 이면, LeastJob 의 객체가
		//'P' 이면, PriorityAllocation 객체가 생성되고,
		//그 밖의 문자가 입력되면, "지원하지 않는 스케줄링입니다." 를 출력
		//입력 문자는 대문자와 소문자 모두 입력 가능하도록 비교하여야 함.
		Scheduler s = null;
		
		System.out.print("전화 상담 방식 선택[A~Z] : ");
		int ch = System.in.read();	//문자 입력시 해당 문자의 아스키 코드 숫자로 형 변환하여 입력됨
		
		if(ch == 'R' || ch == 'r') {
			s = new RoundRobin();
			s.getNextCall();
			s.sendCallToAgent();
		}
		else if(ch == 'L' || ch == 'l') {
			s = new LeastJob();
			s.getNextCall();
			s.sendCallToAgent();
		}
		else if(ch == 'P' || ch == 'p') {
			s = new PriorityAllocation();
			s.getNextCall();
			s.sendCallToAgent();
		}
		else {
			System.out.println("지원하지 않는 스케줄링입니다.");
		}
		
		/* switch문
		switch(ch){
			case 'R':
			case 'r':
				s = new LeastJob();
				break;
				
			case 'L':
			case 'l':
				s = new RoundRobin();
				break;
				
			case 'P':
			case 'p':
				s = new PriorityAllocation();
				break;
			default:
				System.out.println("지원하지 않는 스케줄링입니다.");
		}
		
		s.getNextCall();
		s.sendCallToAgent();
		*/
	}
}
