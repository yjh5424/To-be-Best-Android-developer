선언적 프로그래밍  
안드로이드 내에서는 큼직한 절차가 정의되어 있으므로 정의되어 있는 함수를 선언하여 사용
안드로이드는 컴포넌트 내에서 이런 함수를 사용해 달라 선언해 놓고, 절차에 맞추어 알아서 호출됨(onCreate...)
안드로이드의 3개 개념
components
activity
보여지는 것들
액티비티에 종속적인 네트워크 통신 가능
service
액티비티에 종속적이지 않은 네트워크 통신(다운로드...) 등을 함
액티비티 내의 다른 스레드 사용과 다른 점은: 액티비티가 종료된 후에도 정보의 저장이 가능함
서비스 내에서도 스레드를 설정하여 사용
broadcast receiver
시스템 이벤트를 들을 때 사용. onReceive() 후 소멸
content provider
앱을 다시 켰을 때도 가지고 있어야 할 정보들을 저장
다른 어플리케이션에서 참조하기 위한 목적
ex. 네이버 앱에 로그인을 하면 네이버 웹툰을 다운받아도 로그인이 됨
데이터 교환 목적이 아니더라도 구조화된 데이터를 저장하기 위해서 content provider 사용을 권함
application
LAST BUT NOT LEAST . . .
Single Instance
각종 클래스에서 리소스 참고 시 사용
어플리케이션에서 단 한 개의 인스턴스만 생성되게끔 보장하고 전역에서 사용 가능하게끔 함.
앱의 시작과 끝만 알 수 있음.
manifest
서비스 혹은 컴포넌트를 정의한 후 등록되어야 하는 곳.
uses-feature
Google PlayStore 내에서 필터링
어느 스크린 사이즈를 요구하는지, 어느 기능(블루투스 등)을 사용하는지도 정의 가능하며 이것이 정의되었을 시 Google PlayStore 내에서도 반영됨.
intent
A activity -> B activity 다음 동작 정의
어떤 액티비티의 어떤 동작을 실행할지 정의하는 인텐트
단순 동작을 위한 인텐트
pending intent
intent에 delay를 주고, FLAG를 통해 delay 감지
resources
string, drawable...