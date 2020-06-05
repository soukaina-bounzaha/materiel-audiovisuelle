<p class="lead">Shop Name</p>
<div class="list-group">

         <c:forEach items="${categories}" var="category">
         <a href="${contextRoot}/show/category/${category.idCategorie}/Evenement" class="list-group-item" id="a_${category.nomCategorie}">${category.nomCategorie}</a>
         
		 </c:forEach>
</div>