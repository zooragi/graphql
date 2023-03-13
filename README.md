# DGS framework practice
- https://netflix.github.io/dgs/getting-started/

## 초기 세팅 및 테스트
- DGS framwork에서는 spring boot 최신버전인 3.0.4 버전을 추천하고 있어서 설정 하는데 좀 힘들었다. (queryDSL 세팅이 헷갈렸음)
- 사이트에 나와있는 예제를 따라해서 Show를 만들고 postman으로 테스트
- queryDSL에서 contains 구문에 null 값이 들어가면 Object.getClass() 뭐 값이 null 이라 뜬다. 한참 헤맸누
