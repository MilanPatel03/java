<%@page import="model.Patient"%>
<%@page import="java.util.List"%>
<%@page import="dao.Dao"%>
<%@ include file="adminHeader.jsp" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>


<div class="page-wrapper">
<div class="content">
<div class="row">
<div class="col-sm-4 col-3">
<h4 class="page-title">Patients</h4>
</div>
<div class="col-sm-8 col-9 text-right m-b-20">
<a href="addPatient.jsp" class="btn btn btn-primary btn-rounded float-right"><i class="fa fa-plus"></i> Add Patient</a>
</div>
</div>
<div class="row">
<div class="col-md-12">
<div class="table-responsive">
<table class="table table-border table-striped custom-table datatable mb-0">
<thead>

<%
	Dao dao = new Dao();
	List<Patient>list = dao.viewPatient();
	session.setAttribute("patient", list);

%>


<tr>
<th>Fname</th>
<th>Lname</th>
<th>Email</th>
<th>Password</th>
<th>gender</th>
<th>Phone</th>
<th>DOB</th>
<th>Address</th>
<th>Disease</th>
<th class="text-right">Action</th>
</tr>
</thead>
<tbody>
<c:forEach items="${patient}" var="p">
<tr>
<td>${p.fname }</td>
<td>${p.lname }</td>
<td>${p.email }</td>
<td>${p.password }</td>
<td>${p.gender }</td>
<td>${p.phone }</td>
<td>${p.dob }</td>
<td>${p.address }</td>
<td>${p.disease }</td>

<td>808 8863</td>
<td></td>
<td class="text-right">
<div class="dropdown dropdown-action">
<a href="#" class="action-icon dropdown-toggle" data-toggle="dropdown" aria-expanded="false"><i class="fa fa-ellipsis-v"></i></a>
<div class="dropdown-menu dropdown-menu-right">
<a class="dropdown-item" href="edit-patient.html"><i class="fa fa-pencil m-r-5"></i> Edit</a>
<a class="dropdown-item" href="#" data-toggle="modal" data-target="#delete_patient"><i class="fa fa-trash-o m-r-5"></i> Delete</a>
</div>
</div>
</td>
</tr>
</c:forEach>
</tbody>
</table>
</div>
</div>
</div>
</div>


</div>
<div id="delete_patient" class="modal fade delete-modal" role="dialog">
<div class="modal-dialog modal-dialog-centered">
<div class="modal-content">
<div class="modal-body text-center">
<img src="assets/img/sent.png" alt="" width="50" height="46">
<h3>Are you sure want to delete this Patient?</h3>
<div class="m-t-20"> <a href="#" class="btn btn-white" data-dismiss="modal">Close</a>
<button type="submit" class="btn btn-danger">Delete</button>
</div>
</div>
</div>
</div>
</div>
</div>
<div class="sidebar-overlay" data-reff=""></div>
<script data-cfasync="false" src="../cdn-cgi/scripts/5c5dd728/cloudflare-static/email-decode.min.js"></script><script src="assets/js/jquery-3.2.1.min.js"></script>
<script src="assets/js/popper.min.js"></script>
<script src="assets/js/bootstrap.min.js"></script>
<script src="assets/js/jquery.slimscroll.js"></script>
<script src="assets/js/select2.min.js"></script>
<script src="assets/js/jquery.dataTables.min.js"></script>
<script src="assets/js/dataTables.bootstrap4.min.js"></script>
<script src="assets/js/moment.min.js"></script>
<script src="assets/js/bootstrap-datetimepicker.min.js"></script>
<script src="assets/js/app.js"></script>
</body>

<!-- Mirrored from preclinic.dreamguystech.com/template/patients.html by HTTrack Website Copier/3.x [XR&CO'2014], Thu, 23 Jun 2022 08:24:05 GMT -->
</html>