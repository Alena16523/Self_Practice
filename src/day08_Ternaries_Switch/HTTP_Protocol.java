package day08_Ternaries_Switch;

public class HTTP_Protocol {

    public static void main(String[] args) {

        int statusCode = 200;

        String result=(statusCode==200)?"OK":(statusCode==201)?"Created":(statusCode==202)?"Accepted"
                :(statusCode==301)?"Moved Permanently":(statusCode==303)?"See Other":(statusCode==304)?"Not Modified"
                :(statusCode==307)?"Temporary Redirect":(statusCode==400)?"Bad Request":(statusCode==401)?"Unauthorized"
                :(statusCode==403)?"Forbidden":(statusCode==404)?"Not Found":(statusCode==410)?"Gone":(statusCode==500)?"Internal Server Error"
                :(statusCode==503)?"ServiceUnavailable":"Invalid";

        System.out.println(result);

        System.out.println("---------------------------------------");

        String result2="";

        switch (statusCode){
            case 200:
                result2="OK";
                break;
            case 201:
                result2="Created";
                break;
            case 202:
                result2="Accepted";
                break;
            case 301:
                result2="Moved Permanently";
                break;
            case 303:
                result2="See Other";
                break;
            case 304:
                result2="Not Modified";
                break;
            case 307:
                result2="Temporary Redirect";
                break;
            case 400:
                result2="Bad Request";
                break;
            case 401:
                result2="Unauthorized";
                break;
            case 403:
                result2="Forbidden";
                break;
            case 404:
                result2="Not Found";
                break;
            case 410:
                result2="Gone";
                break;
            case 500:
                result2="Internal Server Error";
                break;
            case 503:
                result2="Service Unavailable";
        }

        System.out.println(result2);








    }

}
/*
HTTP is the protocol that governs communications between web-servers and web clients.
Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request.
    Some of the codes and their meanings are listed below:

            status codes and their meanings:
	                200, OK
	                201, Created
	                202, Accepted
	                301, Moved Permanently
	                303, See Other
	                304, Not Modified
	                307, Temporary Redirect
	                400, Bad Request
	                401, Unauthorized
	                403, Forbidden
	                404, Not Found
	                410, Gone
	                500, Internal Server Error
	                503, Service Unavailable


         declare an int variable called statusCode, and a valid status code is already given
         write a program that prints out, on a line by itself, the appropriate label from the above list based on status.

                    Example:
                        if status code = 200

                    output:
                        ok

        Solution 1: Must use ternary
		Solution 2:	MUST use switch statement

 */