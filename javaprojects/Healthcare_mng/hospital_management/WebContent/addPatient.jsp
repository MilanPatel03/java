<%@ include file="adminHeader.jsp" %>


<div class="page-wrapper">
<div class="content">
<div class="row">
<div class="col-lg-8 offset-lg-2">
<h4 class="page-title">Add Patient</h4>
</div>
</div>
<div class="row">
<div class="col-lg-8 offset-lg-2">
<form action="SavePatient" method="post">
<div class="row">
 <div class="col-sm-6">
<div class="form-group">
<label>First Name <span class="text-danger">*</span></label>
<input class="form-control" type="text" name="firstname">
</div>
</div>
<div class="col-sm-6">
<div class="form-group">
<label>Last Name</label>
<input class="form-control" type="text" name="lastname">
</div>
</div>

<div class="col-sm-6">
<div class="form-group">
<label>Email <span class="text-danger">*</span></label>
<input class="form-control" type="email" name="email">
</div>
</div>
<div class="col-sm-6">
<div class="form-group">
<label>Password</label>
<input class="form-control" type="password" name="password">
</div>
</div>

<div class="col-sm-6">
<div class="form-group gender-select">
<label class="gen-label">Gender:</label>
<div class="form-check-inline">
 <label class="form-check-label">
<input type="radio" name="gender" class="form-check-input" value="Male">Male
</label>
</div>
<div class="form-check-inline">
<label class="form-check-label">
<input type="radio" name="gender" class="form-check-input" value="Female">Female
</label>
</div>
</div>
</div>

<div class="col-sm-6">
<div class="form-group">
<label>Phone </label>
<input class="form-control" type="text" name="phonenumber">
</div>
</div>

<div class="col-sm-6">
<div class="form-group">
<label>Date of Birth</label>
<div class="cal-icon">
<input type="text" class="form-control datetimepicker" name="birthdate">
</div>
</div>
</div>


<div class="col-sm-12">
<div class="row">
<div class="col-sm-12">
<div class="form-group">
<label>Address</label>
<input type="text" class="form-control " name="address">
</div>
</div>
 
</div>
<div class="m-t-20 text-center">
<button class="btn btn-primary submit-btn">Create Patient</button>
</div>
</form>
</div>
</div>
</div>
<div class="notification-box">
<div class="msg-sidebar notifications msg-noti">
<div class="topnav-dropdown-header">
<span>Messages</span>
</div>
<div class="drop-scroll msg-list-scroll" id="msg_list">
<ul class="list-box">
<li>
<a href="chat.html">
<div class="list-item">
<div class="list-left">
<span class="avatar">R</span>
</div>
<div class="list-body">
<span class="message-author">Richard Miles </span>
<span class="message-time">12:28 AM</span>
<div class="clearfix"></div>
<span class="message-content">Lorem ipsum dolor sit amet, consectetur adipiscing</span>
</div>
</div>
</a>
</li>
<li>
<a href="chat.html">
<div class="list-item new-message">
<div class="list-left">
<span class="avatar">J</span>
</div>
<div class="list-body">
<span class="message-author">John Doe</span>
<span class="message-time">1 Aug</span>
<div class="clearfix"></div>
<span class="message-content">Lorem ipsum dolor sit amet, consectetur adipiscing</span>
</div>
</div>
</a>
</li>
<li>
<a href="chat.html">
<div class="list-item">
<div class="list-left">
<span class="avatar">T</span>
</div>
<div class="list-body">
<span class="message-author"> Tarah Shropshire </span>
<span class="message-time">12:28 AM</span>
<div class="clearfix"></div>
<span class="message-content">Lorem ipsum dolor sit amet, consectetur adipiscing</span>
</div>
</div>
</a>
</li>
<li>
<a href="chat.html">
<div class="list-item">
<div class="list-left">
<span class="avatar">M</span>
</div>
<div class="list-body">
<span class="message-author">Mike Litorus</span>
<span class="message-time">12:28 AM</span>
<div class="clearfix"></div>
<span class="message-content">Lorem ipsum dolor sit amet, consectetur adipiscing</span>
</div>
</div>
</a>
</li>
<li>
<a href="chat.html">
<div class="list-item">
<div class="list-left">
<span class="avatar">C</span>
</div>
<div class="list-body">
<span class="message-author"> Catherine Manseau </span>
<span class="message-time">12:28 AM</span>
<div class="clearfix"></div>
<span class="message-content">Lorem ipsum dolor sit amet, consectetur adipiscing</span>
</div>
</div>
</a>
</li>
<li>
<a href="chat.html">
<div class="list-item">
<div class="list-left">
<span class="avatar">D</span>
</div>
<div class="list-body">
<span class="message-author"> Domenic Houston </span>
<span class="message-time">12:28 AM</span>
<div class="clearfix"></div>
<span class="message-content">Lorem ipsum dolor sit amet, consectetur adipiscing</span>
</div>
</div>
</a>
</li>
<li>
<a href="chat.html">
<div class="list-item">
<div class="list-left">
<span class="avatar">B</span>
</div>
<div class="list-body">
<span class="message-author"> Buster Wigton </span>
<span class="message-time">12:28 AM</span>
<div class="clearfix"></div>
<span class="message-content">Lorem ipsum dolor sit amet, consectetur adipiscing</span>
</div>
</div>
</a>
</li>
<li>
<a href="chat.html">
<div class="list-item">
<div class="list-left">
<span class="avatar">R</span>
</div>
<div class="list-body">
<span class="message-author"> Rolland Webber </span>
<span class="message-time">12:28 AM</span>
<div class="clearfix"></div>
<span class="message-content">Lorem ipsum dolor sit amet, consectetur adipiscing</span>
</div>
</div>
</a>
</li>
<li>
<a href="chat.html">
<div class="list-item">
<div class="list-left">
<span class="avatar">C</span>
</div>
<div class="list-body">
<span class="message-author"> Claire Mapes </span>
<span class="message-time">12:28 AM</span>
<div class="clearfix"></div>
<span class="message-content">Lorem ipsum dolor sit amet, consectetur adipiscing</span>
</div>
</div>
</a>
</li>
<li>
<a href="chat.html">
<div class="list-item">
<div class="list-left">
<span class="avatar">M</span>
</div>
<div class="list-body">
<span class="message-author">Melita Faucher</span>
<span class="message-time">12:28 AM</span>
<div class="clearfix"></div>
<span class="message-content">Lorem ipsum dolor sit amet, consectetur adipiscing</span>
</div>
</div>
</a>
</li>
<li>
<a href="chat.html">
<div class="list-item">
<div class="list-left">
<span class="avatar">J</span>
</div>
<div class="list-body">
<span class="message-author">Jeffery Lalor</span>
<span class="message-time">12:28 AM</span>
<div class="clearfix"></div>
<span class="message-content">Lorem ipsum dolor sit amet, consectetur adipiscing</span>
</div>
</div>
</a>
</li>
<li>
<a href="chat.html">
<div class="list-item">
<div class="list-left">
<span class="avatar">L</span>
</div>
<div class="list-body">
<span class="message-author">Loren Gatlin</span>
<span class="message-time">12:28 AM</span>
<div class="clearfix"></div>
<span class="message-content">Lorem ipsum dolor sit amet, consectetur adipiscing</span>
</div>
</div>
</a>
</li>
<li>
<a href="chat.html">
<div class="list-item">
<div class="list-left">
<span class="avatar">T</span>
</div>
<div class="list-body">
<span class="message-author">Tarah Shropshire</span>
<span class="message-time">12:28 AM</span>
<div class="clearfix"></div>
<span class="message-content">Lorem ipsum dolor sit amet, consectetur adipiscing</span>
</div>
</div>
</a>
</li>
</ul>
</div>
<div class="topnav-dropdown-footer">
<a href="chat.html">See all messages</a>
</div>
</div>
</div>
</div>
</div>
<div class="sidebar-overlay" data-reff=""></div>
<script src="assets/js/jquery-3.2.1.min.js"></script>
<script src="assets/js/popper.min.js"></script>
<script src="assets/js/bootstrap.min.js"></script>
<script src="assets/js/jquery.slimscroll.js"></script>
<script src="assets/js/select2.min.js"></script>
<script src="assets/js/moment.min.js"></script>
<script src="assets/js/bootstrap-datetimepicker.min.js"></script>
<script src="assets/js/app.js"></script>
</body>

<!-- Mirrored from preclinic.dreamguystech.com/template/add-patient.html by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 23 Jun 2022 08:24:22 GMT -->
</html>
