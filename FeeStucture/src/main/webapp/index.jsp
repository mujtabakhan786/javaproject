<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.center1 {
	margin-left: auto;
	margin-right: auto;
	margin-top: auto;
}
</style>
</head>
<body marginheight="70px" style="margin-left: 30%; margin-right: 30%">
	<div style="border: 1px solid black">
		<h1 align="center" style="color: blue;">TECHSKILLS IT SOLUTIONS</h1>
		<hr>
		<p align="center">
			A-101,First,Above A-20,Sakinaka Industrial Market,Beside Holiday Inn
			Hotel, <br> Ghatkopar-Andheri Link Road,Sakinaka,Andheri(East)
			Mumbai-400072 <br> Contact.:+91-8976961138
		</p>
		<hr>
		<h2 align="center" style="text-decoration: underline;">FEE
			RECEIPT</h2>
		<table  style="border-collapse: collapse;">
			<tr>
				<td>Receipt No.</td>
				<td>
					<input type="number" name="user_receipt" readonly="readonly">
				</td>
			</tr>
			<tr>
				<td>Student's Name</td>
				<td>
					<input type="text" name="user_name" placeholder="Enter name">
				</td>
			</tr>
			<tr>
				<td>Student's Mobile No.</td>
				<td>
					<input type="number" name="user_mobile" placeholder="Enter Mobile no">
				</td>
			</tr>
			<tr>
				<td>Course</td>
				<td>
					<select name="Course">
						<option value="cash">Core Java</option>
						<option value="upi">Advance Java</option>
						<option value="credit card">SQL</option>
						<option value="debit card">HTML</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>Date of Joining</td>
				<td>
					<input type="date" name="user_doj" placeholder="Enter doj">
				</td>
			</tr>
			<tr>
				<td>Course Fee</td>
				<td>
					<input type="number" name="user_course" placeholder="Enter course fee">
				</td>
			</tr>
			<tr>
				<td>Fee paid</td>
				<td>
					<input type="number" name="user_feepaid" placeholder="Enter fee paid">
				</td>
			</tr>
			<tr>
				<td>Fee Paid (in word)</td>
				<td><input type="text"></td>
			</tr>
			<tr>
				<td>Payment Mode</td>
				<td>
					<select name="Payment Mode">
						<option value="cash">CASH</option>
						<option value="upi">UPI</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>Total Fee Paid</td>
				<td>
					<input type="number" name="user_mobie" placeholder="Enter Mobile no">
				</td>
			</tr>
			<tr>
				<td>Balance Fee to be Paid</td>
				<td><input type="number"></td>
			</tr>
			<tr>
				<td>Due Date for Next Instalment</td>
				<td>
					<input type="date" name="user_mobie" placeholder="Enter Mobile no">
				</td>
			</tr>
		</table>
		<hr>
		<p>
		Note:- <br> 1. Fees once paid will not be
					refunded under any circumstances <br> 2. Kindly pay the
					remaining balance fee on or before due date
		</p>
		<hr>
		<p align="center" style="margin-top: -10px; margin-bottom: 10px;">
			This is a system generated receipt.Hence signature not required
		</p>
	</div>
</body>
</html>