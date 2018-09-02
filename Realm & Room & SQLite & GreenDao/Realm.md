# Realm


1. 소개   
Java, Swift, Objective-C, JavaScript, .Net 지원하는 데이터베이스이다 최근에는 많은 개발자들이 안드로이드 로컬 DB로 사용한다. 

2. 특징 
![screenshot](https://i1.wp.com/developer.dramancompany.com/wp-content/uploads/2016/03/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA-2016-03-14-%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE-7.57.59.png
) 
다른 안드로이드 로컬 DB 보다 성능이 매우 좋다. 
GreenDao 랑 비교를 해봤을 때 데이터가 적을경우는 별 차이가 없지만 점점 데이터가 많아질수록 삽입, 조회 부분에서도 엄청난 성능차리를 보여준다. 

3. 사용법
- 다른 데이터베이스에 비해 간편하다. 스키마를 정의할때는 RealmObject 상속받아서 기본키, 필드들을 정의해주면 된다.   
- 쿼리를 사용하지 않고 Realm 지원해주는 메소드를 이용하여 조회를 해주면 된다. 
