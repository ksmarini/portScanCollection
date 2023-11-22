package java;

class PortScan {
    
    private static void printUsage() {
        System.out.println("Usage:");
        System.out.println("    java PortScan <<hots>>");
        System.out.println("Exemples:");
        System.out.println("    java PortScan 127.0.0.1");
        System.out.println("    java PortScan google.com");
    }

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("No arguments received.");
            printUsage();
            System.exit(1);
        }
        String host = args[0];
        System.out.println(host);   
        System.out.println(args);   
        System.out.printf("Scanning %s now...", host);   

        // port 1-65535
        // Open a TCP connection for each port
        // 
        //stop 17:50
    }
}