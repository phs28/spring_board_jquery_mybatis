<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

	<%@include file="../includes/header.jsp" %>

		<div id="page-wrapper">
			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header">Tables</h1>
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
			<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-default">
						<div class="panel-heading">
							Board List Page
						<a class="btn btn-xs pull-right" href="/board/register">Register New Board</a>
						</div>
						
						<!-- /.panel-heading -->
						<div class="panel-body">
							<table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
								<thead>
									<tr>
										<th>#번호</th>
										<th>제목</th>
										<th>작성자</th>
										<th>작성일</th>
										<th>수정일</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${list }" var="vo">
									<tr>
										<td><c:out value="${vo.bno }" /></td>
										<td><c:out value="${vo.title }" /></td>
										<td><c:out value="${vo.content }" /></td>
										<td><c:out value="${vo.writer }" /></td>
										<td><fmt:formatDate pattern="yyyy-mm-dd" value="${vo.regdate }"/></td>
										<td><fmt:formatDate pattern="yyyy-mm-dd" value="${vo.updateDate }"/></td>
									</tr>
									</c:forEach>
								</tbody>
							</table>
							<!-- /.table-responsive -->
						</div>
						<!-- /.panel-body -->
					</div>
					<!-- /.panel -->
				</div>
				<!-- /.col-lg-12 -->
			</div>
	</div>
	<!-- /#wrapper -->
	<script type="text/javascript">

	</script>
	
	<%@include file="../includes/footer.jsp"%>
	