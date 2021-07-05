<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../templates/header.jsp"></jsp:include>
<main class="container mt-6">

<c:if test="${mensaje != null}">
	<div class="columns is-centered mb-4">
		<div class="column is-4">
			<div class="notification is-success">
				<p>${mensaje}</p>
			</div>
		</div>
	</div>
</c:if>
<c:if test="${errores != null}">
		<div class="columns is-centered mb-4">
			<div class="column is-4">
				<div class="notification is-danger">
					<h6>Existen errores en el formulario</h6>
					<div class="content">
						<ul>
							<c:forEach var="error" items="${errores}">
								<li>${error}</li>
							</c:forEach>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</c:if>
	<div class="columns is-centered">
		<div class="column is-8">
			<form method="POST" action="AgregarAsistenteController.do">
				<div class="card">
					<div class="card-header has-background-warning mt-5">
						<span class="card-header-title text is-centered">Agregar Asistente</span>
					</div>
					<div class="card-content">
						<div class="field">
							<label class="label mt-5" for="rut-txt">Rut</label>
							<div class="control">
								<input type="text" class="input" id="rut-txt" name="rut-txt" />
							</div>
						</div>
						<div class="field">
							<label class="label" for="nombre-txt">Nombre</label>
							<div class="control">
								<input type="text" class="input" id="nombre-txt"
									name="nombre-txt" />
							</div>
						</div>
						<div class="field">
							<label class="label" for="apellido-txt">Apellido</label>
							<div class="control">
								<input type="text" class="input" id="apellido-txt"
									name="apellido-txt" />
							</div>
						</div>
						<div class="field">
							<label class="label" for="edad-txt">Edad</label>
							<div class="control">
								<input type="number" class="input" name="edad-txt" id="edad-txt"  max="100" min="18" />
							</div>
						</div>
						<div class="field">
							<label class="label" for="empresa-txt">Empresa</label>
							<div class="control">
								<input type="text" class="input" id="empresa-txt"
									name="empresa-txt" />
							</div>
						</div>
						<div class="field ">
							<label class="label has-text-centered mt-4" for="estado-select">Estado:</label>
							<div class="control has-text-centered mt-2 mb-2">
								<div class="select ">
									<select name="estado-select" id="estado-select">
										<option>Pagada</option>
										<option>Con Deuda</option>
									</select>
								</div>
							</div>
						</div>
						<div class="field">
							<label class="label has-text-centered mt-4" for="region-select">Región:</label>
							<div class="control has-text-centered mt-2 mb-2">
								<div class="select">
									<select name="region-select" id="region-select">
										<option>Norte de Chile</option>
										<option>Sur de Chile</option>
										<option>Valparaíso</option>
										<option>Santiago</option>
										<option>Internacional</option>
									</select>
								</div>
							</div>
						</div>
						<div class="card-footer has-text-centered">
							<div class="card-footer-item">
								<button type="submit" class="button is-info" name="btnGuardar" id="agregar-btn">Registrar</button>
							</div>
						</div>
					</div>
				</div>
			</form>
		</div>
	</div>
</main>

<body>