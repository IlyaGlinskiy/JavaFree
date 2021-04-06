package by.glinkiy.lesson6.annotation;

public class Runner {
    public static void main(String[] args) throws Exception {
        VersionProcessor processor = new VersionProcessor();
        processor.getVersion(MyService.class);


    }
}

