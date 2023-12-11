<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
    String driver = "oracle.jdbc.driver.OracleDriver";
    String url =  "jdbc:oracle:thin:@localhost:1521:xe";
    String user = "scott";
    String pwd =  "tiger";
    
    try {
         Class.forName(driver);
         System.out.println("드라이버 검색 성공");
      } catch (Exception e) {
         e.printStackTrace();
   }
    
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    
    /* 게시판 가장 최신값지우는 테스트 */
    try {
         String query = "delete from mvc_board where bid = (select max(bid) from mvc_board)";
         
         connection = DriverManager.getConnection(url,user,pwd); //DB 연결
         
         connection.setAutoCommit(false); //오토 커밋을 false 함
         
         preparedStatement = connection.prepareStatement(query);         
         int rn = preparedStatement.executeUpdate();

         System.out.println("삭제된 갯수 : " + rn);
         
         throw new Exception("오류 발생 !!");

      } catch (Exception e) {
         connection.rollback(); // 롤백을 시킴
         
         e.printStackTrace();
      } finally {
         try {
            if (preparedStatement != null)
               preparedStatement.close();
            if (connection != null)
               connection.close();
         } catch (Exception e2) {
            e2.printStackTrace();
         }
      }
   
         
%>
   


   
</body>
</html>