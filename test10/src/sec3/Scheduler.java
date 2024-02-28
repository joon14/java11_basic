package sec3;
//스케줄링 : 선점형과 비선점형이 있다.
//선점(Preemption) : 해당 프로세스가 처리되다가 다른 프로세스에게 CPU를 양도될 수 있는 스케줄링
//비선점(Non-Preemption) : 해당 프로세스가 모두 완료될 때까지 다른 프로세스에게 CPU를 양도할 수 없는 스케줄링
//FCFS(First Come First Service) : 선착순(기본형)
public interface Scheduler {
	void getNextCall();
	void sendCallToAgent();
}
