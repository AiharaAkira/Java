<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	${r }

	<table>
		<tr>
			<td align="center" style="font-size: 50pt;" width="50px;"><c:if
					test="${curPageNo != 1 }">
					<a href="MoviePageController?p=${curPageNo }">&lt;</a>
				</c:if></td>
			<td>


				<form action="MovieRegController" method="post"
					enctype="multipart/form-data">
					<table id="mTbl">
						<tr>
							<td>영화제목</td>
							<td><input name="title"></td>
						</tr>
						<tr>
							<td>배우</td>
							<td><input name="actor"></td>
						</tr>
						<tr>
							<td>사진</td>
							<td><input type="file" name="file"></td>
						</tr>
						<tr>
							<td>줄거리</td>
							<td><textarea name="story"></textarea></td>
						</tr>
						<tr>
							<td colspan="2"><button>등록</button></td>
						</tr>
					</table>
				</form> <c:forEach var="m" items="${movies}">
					<table id="mTbl2">
						<tr>
							<td id="m_td2" rowspan="4"><img src="img/${m.img }"
								id="movieImg"></td>
						</tr>
						<tr>
							<td>제목</td>
							<td class="m_td1">${m.title }</td>
						</tr>
						<tr>
							<td>배우</td>
							<td class="m_td1">${m.actor }</td>
						</tr>
						<tr>
							<td>줄거리</td>
							<td class="m_td1">${m.story }</td>
						</tr>
						<tr>
							<td>
								<button onclick="location.href='MovieUpdateC?num=${m.no}'">수정</button>
								<button
									onclick="updateMovie('${m.title}', '${m.actor }', '${m.story }', '${m.no }')">수정(JS)</button>
								<button onclick="deleteMovie(${m.no})">삭제</button>
							</td>
						</tr>
					</table>




				</c:forEach>


			</td>

				<td align="center" style="font-size: 50pt;" width="50px;">
					<c:if test="${curPageNo != pageCount }">
					<a href="MoviePageController?p=${curPageNo }">&gt;</a>
				</c:if></td>

		</tr>
	</table>



</body>
</html>