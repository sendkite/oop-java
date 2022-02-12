package proxyPattern;

public class Proxy implements IService {

    IService service1;

    public String runSomething() {
        System.out.println("프록시는 결과는 그대로여도 이렇게 추가 작업을");
        service1 = new Service();;
        return service1.runSomething();
    }
}
