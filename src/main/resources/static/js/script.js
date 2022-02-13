$(function() {
			$('[data-toggle="popover"]').popover();
		});
		
		$(document).ready(function(){
		    $(".navbar-toggle").click(function(){
		        $(".sidebar").toggleClass("sidebar-open");
		    })
		});
		
		function display(tela) {
			$.ajax({
				type: "GET",
				url: "".concat(tela),
				success: (response) => {
					$('#content').html(response);
				}
			})
		}
		
		function salvarCarro() {
			const modeloCarro = (document.getElementById("modeloCarro").value != null && document.getElementById("modeloCarro").value != "");
			const corCarro = (document.getElementById("corCarro").value != null && document.getElementById("corCarro").value != "");
			const anoCarro = (document.getElementById("anoCarro").value != null && document.getElementById("anoCarro").value != "");
			const fabricanteCarro = (document.getElementById("fabricanteCarro").value != null && document.getElementById("fabricanteCarro").value != "");
			
			if(modeloCarro && corCarro && anoCarro && fabricanteCarro) {
				$.ajax({
					type: "POST",
					url: "/carro/salvar",
					data: $('#cadastroCarro').serialize(),
					success: (response) => {
						alert("Cadastro de veículo realizado com sucesso!");
						$('#content').html(response);	
	
					}
				})
			}
			else{
				alert("Preencha todos os campos corretamente.")
			}
		} 
		
		function deleteCarro(carroId) {
			var confirm = window.confirm("Tem certeza que deseja excluir esse veículo?")
			
			if(confirm) {
				$.ajax({
					type: "GET",
					url: "/carro/delete/".concat(carroId),
					success: (response) => {
						alert("Veículo deletado com sucesso!");
						$('#content').html(response);
					}
				})
			}
		}
		
		function editarCarro(carroId) {
			$.ajax({
				type: "GET",
				url: "/carro/edit/".concat(carroId),
				success: (response) => {
					$('#content').html(response);
				}
			})
		}
		
		function novoAluguel(carroId) {
			$.ajax({
				type: "GET",
				url: "/aluguel/novo/".concat(carroId),
				success: (response) => {
					$('#content').html(response);
				}
			})
		}
		
		function salvarAluguel() {
			const modeloCarro = (document.getElementById("modeloCarro").value != null && document.getElementById("modeloCarro").value != "");
			const corCarro = (document.getElementById("corCarro").value != null && document.getElementById("corCarro").value != "");
			const anoCarro = (document.getElementById("anoCarro").value != null && document.getElementById("anoCarro").value != "");
			const fabricanteCarro = (document.getElementById("fabricanteCarro").value != null && document.getElementById("fabricanteCarro").value != "");
			const dataInicio = (document.getElementById("dataInicio").value != null && document.getElementById("dataInicio").value != "");
			const dataFim = (document.getElementById("dataFim").value != null && document.getElementById("dataFim").value != "");
			
			if(modeloCarro && corCarro && anoCarro && fabricanteCarro && dataInicio && dataFim) {
				$.ajax({
					type: "POST",
					url: "/aluguel/salvar",
					data: $('#cadastroAluguel').serialize(),
					success: (response) => {
						alert("Reserva de veículo efetuada com sucesso!");
						$('#content').html(response);	
	
					}
				})
			}
			else{
				alert("Preencha todos os campos corretamente.")
			}
		}
		