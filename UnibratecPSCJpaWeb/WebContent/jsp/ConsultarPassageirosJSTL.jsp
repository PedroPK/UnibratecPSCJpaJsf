<%@ page 
	language="java" 
	contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Tela de Consulta de Passageiros</title>
	</head>
	<body>
		<form>
			<table width="70%">
				<tr>
					<th colspan="4">
						Consulta ao cadastro de Passageiros
					</thead>
				</tr>
				<tr>
					<th width="20%">
						CPF
					</th>
					<th width="60%">
						Nome:
					</th>
					<th width="25">
						Data de Nascimento:
					</th>
					<th width="05%">
						Necessidades Especiais?
					</th>
				</tr>
				<c:if test="${not empty REQ_RESULTSET_PASSAGEIROS}">
					<c:forEach var="passageiros" items="${REQ_RESULTSET_PASSAGEIROS}">
						<tr>
							<td>
								${passageiros.CPF}
							</td>
							<td>
								${passageiros.nome}
							</td>
							<td>
								${passageiros.dataNascimento}
							</td>
							<td>
								${passageiros.isPortadorNecessidadesEspeciais}
							</td>
						</tr>
					</c:forEach>
				</c:if>
				<c:if test="${empty REQ_RESULTSET_PASSAGEIROS}">
					<tr>
						<td colspan="4">
							Nenhum registro a ser exibido
						</td>
					</tr>
				</c:if>
				<tr>
					<td colspan="4">
						<input type="submit" value="Voltar">
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>