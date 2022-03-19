package com.example.demo.travels;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Contato {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private String email;
		private String mensagem;
			
		public Contato() {
			
}
		
		public Contato(Long id, String email, String mensagem) {
			super();
			this.setId(id);
			this.setEmail(email);
			this.setMensagem(mensagem);
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getMensagem() {
			return mensagem;
		}

		public void setMensagem(String mensagem) {
			this.mensagem = mensagem;
		}

		public static Contato update(Contato obj) {
			// TODO Auto-generated method stub
			return null;
		}
		
}
