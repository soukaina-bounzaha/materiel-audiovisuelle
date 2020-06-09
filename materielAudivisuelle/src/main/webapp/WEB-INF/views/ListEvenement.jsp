<div class="container">

	<div class="row">
		<!-- to display sidebar-->
		<div class="col-md-3">

			<%@include file="./shared/sidebar.jsp"%>

		</div>

		<!-- to display the actual evenement-->

		<div class="col-md-9">

			<!-- added a breadcrumb component-->

			<div class="row">
				<div class="col-md-12">

					<c:if test="${userClickAllEvenement == true }">

						<ol class="breadcrumb">

							<li><a href="${contextRoot}/home"> Home </a></li>
							<li class=active>List Evenement</li>

						</ol>
					</c:if>

					<c:if test="${userClickCategoryEvenement == true }">

						<ol class="breadcrumb">

							<li><a href="${contextRoot}/home"> Home </a></li>
							<li class=active>Category</li>
							<li class=active>${category.nomCategorie}</li>

						</ol>
					</c:if>

				</div>

			</div>
			<div class="row">

				<div class="col-xs-12">
					<table id="EvenementListTable"
						class="table table-striped table-border">
                        <thead>
                      <tr>
                   
                       <th>ID</th>
                      <th>NAME</th>

                         </tr>

                       </thead>
					</table>
				</div>
			</div>

		</div>