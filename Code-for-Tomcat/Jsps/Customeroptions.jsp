 <style type="text/css">
.tab{
font-family: arial, verdana, san-serif;
font-size: 14px;
}
.asd
{
text-decoration: none;
font-family: arial, verdana, san-serif;
font-size: 13px;
color:#4234ff;
}

/*****remove the list style****/
#nav {
margin:0;
padding:0;
list-style:none;
}

/*****LI display inline *****/
#nav li {
float:left;
display:block;
width:73px;
background:lightgreen;
position:relative;
z-index:500;
margin:0 1px;
}

/*****parent menu*****/
#nav li a {
display:block;
padding:8px 5px 0 5px;
font-weight:700;
height:23px;
text-decoration:none;
color:lightblue;
text-align:center;
color:blue;
}

#nav li a:hover
{
color:;
}

/* style for default selected value */ #nav a.selected {
color:#4234ff;
}
/* submenu */ #nav ul
{
position:absolute;
left:0;
display:none;
margin:0 0 0 -1px;
padding:0;
list-style:none;
}

#nav ul li
{
width:150px;
float:left;
border-top:1px solid #fff;
}

/* display block will make the link fill the whole area of LI */ #nav ul a
{
display:block;
padding:8px 5px 0 5px;
font-weight:1000;
height:23px;
text-decoration:none;
color:lightblue;
text-align:center;
color:black;
}

#nav ul a:hover
{
text-decoration:underline;
padding-left:15px;
}
</style>

<script type="text/javascript" src="<%=request.getContextPath() %>/js/jquery.js">
</script>

<script type="text/javascript">
$(document).ready(function () {
$('#nav li').hover(
function () {
//show its submenu
$('ul', this).slideDown(350);
},
function () {
//hide its submenu
$('ul', this).slideUp(350);
}
);
});
</script>

<input type=hidden name=arav value="4*#*#*1*#*#*1*#*#*1*#*#*1"><ul id='nav'>
<li> <a href="<%=request.getContextPath()+"/jsps/userhome.jsp" %>">Home</a>
<ul>
</ul>
<li> <a href='#'>ComplaintInfo</a>
<ul>
<li style='background-color:lightblue;'><a href="<%=request.getContextPath()+"/jsps/Complaint.jsp" %>">GiveComplaint</a></li>
<li style='background-color:lightblue;'><a href="<%=request.getContextPath()+"/GetComplaintStatusAction"%>">View Complaint Status</a></li>

</ul>
<li> <a href='#'>EmpInfo</a>
<ul>
<li style='background-color:lightblue;'><a href="<%=request.getContextPath()+"/GetEmpdetailsAction"%>">ViewAllEmployees</a></li>


</ul>



<li> <a href='#'>Queries&FeedBack</a>
<ul>
<li style='background-color:lightblue;'><a href="<%=request.getContextPath()+"/jsps/Queries.jsp"%>">PostQueries</a></li>
<li style='background-color:lightblue;'><a href="<%=request.getContextPath()+"/GetQueryStatusAction"%>">View Query Status</a></li>
<li style='background-color:lightblue;'><a href="<%=request.getContextPath()+"/GetQueryStatusAction"%>">ViewSolution</a></li>
<li style='background-color:lightblue;'><a href="<%=request.getContextPath()+"/jsps/FeedBack.jsp"%>">Leave U R FeedBack</a></li>
</ul>
<li> <a href='#'>Security</a>
<ul>
<li style='background-color:lightblue;'><a href="<%=request.getContextPath()+"/jsps/Changepassword.jsp" %>">ChangePassword</a></li>

</ul>
<li> <a href='#'>Profile</a>
<ul>
<li style='background-color:lightblue;'><a href="<%=request.getContextPath()+"/jsps/ViewProfile.jsp" %>">ViewProfile</a></li>
<li style='background-color:lightblue;'><a href="<%=request.getContextPath()+"/jsps/UpdateProfile.jsp" %>">Update Profile</a></li>

</ul>



<li> <a href="<%=request.getContextPath()+"/LogoutAction"%>">LogOut</a>
<ul>
</ul>
</li>
</ul>