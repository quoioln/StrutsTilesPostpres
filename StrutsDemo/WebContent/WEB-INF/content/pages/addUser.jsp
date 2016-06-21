<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<script type="text/javascript" src="resources/javascripts/addUser.js"></script>
<div class="table-title">Add account</div>
<form action="addUserAction" name="mainForm" method="post">
	
	<table class="main-table">
		<tbody>
			<tr>
				<td>User name: </td>
				<td>
					<input type="text" value="${userName }" name="userName"></input>
<!-- 					<br> -->
					<s:if test="hasFieldErrors()">
						<label class="invalidMsg" style="float: none">
							<s:property value="fieldErrors.get('userName').get(0)" />
						</label>
			        </s:if>
				</td>
			</tr>
			<tr>
				<td>Password: </td>
				<td>
					<input type="password" name="password"></input>
<!-- 					<br> -->
					<s:if test="hasFieldErrors()">
						<label class="invalidMsg" style="float: none">
							<s:property value="fieldErrors.get('password').get(0)" />
						</label>
			        </s:if>
				</td>
			</tr>
			
			<tr>
				<td>Confirm Password: </td>
				<td>
					<input type="password" name="rePassword" ></input>
<!-- 					<br> -->
					<s:if test="hasFieldErrors()">
						<label class="invalidMsg" style="float: none">
							<s:property value="fieldErrors.get('rePassword').get(0)" />
						</label>
			        </s:if>
				</td>
			</tr>
			<tr>
				<td>Full name: </td>
				<td>
					<input type="text" name="fullName" value="${fullName }"/>
<!-- 					<br> -->
					<s:if test="hasFieldErrors()">
						<label class="invalidMsg" style="float: none">
							<s:property value="fieldErrors.get('fullName').get(0)" />
						</label>
			        </s:if>
				</td>
				
			</tr>
			
			
			<tr>
				<td>Email: </td>
				<td>
					<input type="text" name="email" value="${email }"/>
<!-- 					<br> -->
					<s:if test="hasFieldErrors()">
						<label class="invalidMsg" style="float: none">
							<s:property value="fieldErrors.get('email').get(0)" />
						</label>
			        </s:if>
				</td>
			</tr>

			
			<tr>
				<td>Phone number: </td>
				<td>
					<input type="text" name="phone" value="${phoneNum }"/>
<!-- 					<br> -->
					<s:if test="hasFieldErrors()">
						<label class="invalidMsg" style="float: none">
							<s:property value="fieldErrors.get('phoneNum').get(0)" />
						</label>
			        </s:if>
				</td>
			</tr>
			
			<tr>
				<td colspan="2">
					<input type="button" value="Add" id="btnAdd"/> &nbsp;&nbsp;
					<input type="button" value="Back" id="btnBack"/>				
				</td>
			</tr>
			<tr><td colspan="2">
				<s:if test="hasFieldErrors()">
						<label class="invalidMsg" style="float: none">
							<s:property value="fieldErrors.get('error').get(0)" />
						</label>
		        </s:if>
			</td></tr>
		</tbody>
	</table>
	
<!-- 	<input type="hidden" id="action"/>; -->
</form>