<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../templates/header.jsp"></jsp:include>
<% int c;
	c=0;%>
<main class="container mt-6">
	<div class="columns is-centered">
		<div class="column is-8">
			<div class="field has-text-centered">
				<label class="label" for="estado-select">Filtrar por Estado</label>
				<div class="control">
					<div class="select">
						<select name="estado-select" id="estado-select">
							<option>Pagada</option>
							<option>Con Deuda</option>
						</select>
					</div>
					<a href="VerAsistenteController.do?estadoBuscar=${asistente.estado}">
						<button type="submit" class="button is-warning">Filtrar</button> 
					</a>
				</div>
			</div>
			<div class="card-footer has-text-centered">
				<div class="card-footer-item">
					
		
					<table class="table is-hovered is-bordered is-fullwidth">
						<thead class="has-background-warning">
							<tr>
								<th></th>
								<th>Nombre Completo</th>
								<th>Empresa</th>
								<th>Region</th>
								<th>Estado</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="asistente" items="${asistentes}">
								<tr>
									<td>${c=c+1}</td>
									<td>${asistente.nombre} ${asistente.apellido}</td>
									<td>${asistente.empresa}</td>
									<td>${asistente.region}</td>
									<td>${asistente.estado}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
			<div class="Columns is-centered">
				<div class="column is-8 is-centered">
					<div class="box is-centered">
						La cantidad total de esistentes es de: ${c}
					</div>
				</div>
			</div>
		</div>
	</div>
</main>
</body>
</html>