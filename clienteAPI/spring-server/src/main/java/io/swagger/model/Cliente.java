package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Cliente
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-08T16:23:03.102-02:00")

public class Cliente   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("nome")
  private String nome = null;

  @JsonProperty("sobrenome")
  private String sobrenome = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("datanascimento")
  private LocalDate datanascimento = null;

  public Cliente() {
  }
  
  public Cliente(Integer id, String nome, String sobrenome, String status, LocalDate datanascimento) {
	super();
	this.id = id;
	this.nome = nome;
	this.sobrenome = sobrenome;
	this.status = status;
	this.datanascimento = datanascimento;
  }

public Cliente id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Id do cliente.
   * @return id
  **/
  @ApiModelProperty(value = "Id do cliente.")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Cliente nome(String nome) {
    this.nome = nome;
    return this;
  }

   /**
   * Nome do cliente
   * @return nome
  **/
  @ApiModelProperty(value = "Nome do cliente")


  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Cliente sobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
    return this;
  }

   /**
   * Sobrenome do cliente
   * @return sobrenome
  **/
  @ApiModelProperty(value = "Sobrenome do cliente")


  public String getSobrenome() {
    return sobrenome;
  }

  public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
  }

  public Cliente status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status do cliente
   * @return status
  **/
  @ApiModelProperty(value = "Status do cliente")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Cliente datanascimento(LocalDate datanascimento) {
    this.datanascimento = datanascimento;
    return this;
  }

   /**
   * Data de nascimento do cliente
   * @return datanascimento
  **/
  @ApiModelProperty(value = "Data de nascimento do cliente")

  @Valid

  public LocalDate getDatanascimento() {
    return datanascimento;
  }

  public void setDatanascimento(LocalDate datanascimento) {
    this.datanascimento = datanascimento;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cliente cliente = (Cliente) o;
    return Objects.equals(this.id, cliente.id) &&
        Objects.equals(this.nome, cliente.nome) &&
        Objects.equals(this.sobrenome, cliente.sobrenome) &&
        Objects.equals(this.status, cliente.status) &&
        Objects.equals(this.datanascimento, cliente.datanascimento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, sobrenome, status, datanascimento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cliente {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    sobrenome: ").append(toIndentedString(sobrenome)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    datanascimento: ").append(toIndentedString(datanascimento)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

