
<!DOCTYPE HTML PUBLIC "-//w3c//dtd html 4.0 transitional//en">
<html>
	<head>
	<script language="JavaScript" src="<%=request.getContextPath()+"/js/gen_validatorv31.js"%>" type="text/javascript"></script>
		<style type="text/css">
.Title {
font-family:Verdana;
font-weight:bold;
font-size:8pt
}
.Title1 {font-family:Verdana;
font-weight:bold;
font-size:8pt
}
        </style>
	</head>
	<body>

 <jsp:include page="../jsps/Header.jsp"></jsp:include>
  
  <br/>


        <form action="<%=request.getContextPath()+"/LoginAction"%>" method=post name="login">
        <table  border="0" align="center"  bgcolor="white" width="80%">
               <tr>
                 <td height="120" align="right"></td>
                 <td><table border="0" align="center">
                <tr align="center"><strong><h3><font color="#01AFFF">Login Form</font></h3></strong>
 	</tr>
                   <tr>
                     <td ><span class="Title"><font color="#01AFOO">UserID</font></span></td>
                      <td ><input type="text" name="username">                      </td>
                      </tr>
                   <tr>
                     <td><span class="Title"><font color="#01AFOO">Password</font></span></td>
                      <td>
                        <input type="password" name="password">                      </td>
                      </tr>
                   <tr>
                     <td colspan="2">
                       <div align="center" class="style11">
                         <input type="submit" name="Submit" value="Sign In">
                          &nbsp;
                          <input name="Input2" type="reset" value="Clear">
                         </div>                        </td>
                      </tr>
                 </table></td>
                 <td>&nbsp;</td>
               </tr>
               <tr>
                 <td >&nbsp;</td>
                 <td>
                 <div align="center"><a href="<%=request.getContextPath()+"/jsps/Recoverpassword.jsp" %>"><strong><font color="#1274c9">Forgot Password ! !......</font></strong></a></div></td>
                 <td>&nbsp;</td>
               </tr>
               <tr>
                 <td >&nbsp;</td>
                 <td>
                 <div align="center"><a href="<%=request.getContextPath()+"/jsps/Registerform.jsp"%>"><strong><font color="#1274c9">New User....?</font></strong></a></div></td>
                 <td>&nbsp;</td>
               </tr>
               
             </table>
		
		
          </form>
          <script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("login");

  frmvalidator.addValidation("username","req","Login Name is required");
    frmvalidator.addValidation("username","alpha","Login Name is Only Characters");
    frmvalidator.addValidation("password","req","Password is required");
   
  </script>
          <br/>
                 
     <br/>
     <jsp:include page="Footer.jsp"></jsp:include>
	</body>
</html>