<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<script type="text/javascript" src="resources/javascripts/home.js"></script>
<div class="table-title">Accounts</div>
<form action="viewUserAction" id="mainForm" name="mainForm">
	<table class="main-table">
		<s:if test="accountList != null">
			<thead>
				<tr>
					<td class="row-header">Choose</td>
					<td class="row-header">User name</td>
					<td class="row-header">Password</td>
					<td class="row-header">Full name</td>
					<td class="row-header">Email</td>
					<td class="row-header">Phone number</td>
				</tr>
			</thead>
			
			<tbody>
<%-- 				<s:iterator status="status" var="i" begin="0" end="accountList.size() - 1"> --%>
				<s:iterator status="status" value="accountList">
<%-- 					<s:set var="account" value="accountList.get(#i)"/> --%>
					<tr>
<%-- 						<td class="row-content"><input class = "checkAccountId" type="radio"  name = "accountId" value="${account.getUserName() }"/></td> --%>
<%-- 						<td class="row-content">${account.getUserName() }</td> --%>
<%-- 						<td class="row-content">${account.getPassword() }</td> --%>
<%-- 						<td class="row-content">${account.getFullName() }</td> --%>
<%-- 						<td class="row-content">${account.getEmail() }</td> --%>
<%-- 						<td class="row-content">${account.getPhone() }</td> --%>
						<td class="row-content"><input class = "checkAccountId" type="radio"  name = "accountId" value="<s:property value="accountId"/>"/></td>
						<td class="row-content"><s:property value="userName"/></td>
						<td class="row-content"><s:property value="password"/></td>
						<td class="row-content"><s:property value="fullName"/></td>
						<td class="row-content"><s:property value="email"/></td>
						<td class="row-content"><s:property value="phone"/></td>
					</tr>
				</s:iterator>
				<tr>
					<td colspan="6">
						<div class="button-group">
							<input type="button" value="Add" id="btnAdd"/> &nbsp;&nbsp;
							<input type="button" value="Update" id="btnUpdate"/> &nbsp;&nbsp;
							<input type="button" value="Delete" id="btnDelete"/> &nbsp;&nbsp;
						</div>
					</td>
				</tr>
			</tbody>
			<input type="hidden" name="action" id="action"/>
		</s:if>
	</table>
</form>