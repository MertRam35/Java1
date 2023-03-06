package day11_SwitchStatements;

public class StatusCode {
    public static void main(String[] args) {

        int statusCode = 777;
        String name = "";
        switch (statusCode) {
            case 200:
                name = "OK";
                break;
            case 201:
                name = "Created";
                break;
            case 202:
                name = "Accepted";
                break;
            case 301:
                name = "Moved Permanently";
                break;
            case 303:
                name = "See Other";
                break;
            case 304:
                name = "Not Modified";
                break;
            case 307:
                name = "Temporary Rediret";
                break;
            case 400:
                name = "Bad Request";
                break;
            case 401:
                name = "Unauthorized";
                break;
            case 403:
                name = "Forbidden";
                break;
            case 404:
                name = "Not Found";
                break;
            case 410:
                name = "Gone";
                break;
            case 500:
                name = "Internal Server Error";
                break;
            case 503:
                name = "Service Unavaliable";
                break;
            default:
                name = "Sorry";


        }
        System.out.println(statusCode+" "+name);
    }
}
