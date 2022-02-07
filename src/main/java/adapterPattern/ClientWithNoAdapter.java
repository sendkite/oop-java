package adapterPattern;

public class ClientWithNoAdapter {
    public static void main(String[] args) {
//        ServiceA sa1 = new ServiceA();
//        ServiceB sa2 = new ServiceB();
//
//        sa1.runServiceA();
//        sa2.runServiceB();
        // 어떤 인터페이스를 클라이언트에서 요구하는 형태로 적응시켜주는 역할
        // 즉 호환되지 않는 인터페이스를 연결해서 쓸 수 있는 것
        AdapterServiceA asa1 = new AdapterServiceA();
        AdapterServiceB asb1 = new AdapterServiceB();

        asa1.runService();
        asb1.runService();

     }
}
