[//]: # (대량의 메시지를 스레드풀을 사용하여 비동기적으로 발송하는 라이브러리입니다.<br> )

[//]: # ()
[//]: # (지정된 크기의 스레드풀을 활용해 메시지를 발송하며, 메시지 발송 방식을 변경할 수 있습니다.<br>)

[//]: # ()
[//]: # (기본적으로 각 메시지는 500ms 후에 출력됩니다.<br>)

[//]: # ()
[//]: # ()
[//]: # ()
[//]: # ()
[//]: # (-기능-<br>)

[//]: # ()
[//]: # (스레드풀: 사용자 정의 크기의 스레드풀을 직접 구현하여 메시지 작업을 병렬 처리.<br>)

[//]: # ()
[//]: # (메시지 발송 방식: 메시지를 발송하는 로직은 기본 구현&#40;DefaultMessage&#41; 외에 확장 가능.<br>)

[//]: # ()
[//]: # (전략 패턴: 다양한 메시지 발송 방식의 유연한 변경 지원.<br>)

[//]: # ()
[//]: # (Runnable 작업: 메시지를 반복적으로 출력하는 작업을 정의.<br>)

[//]: # ()
