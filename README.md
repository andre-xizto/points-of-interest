# API de Pontos de Interesse

![GitHub repo size](https://img.shields.io/github/repo-size/andre-xizto/points-of-interest?style=for-the-badge)
![GitHub language count](https://img.shields.io/github/languages/count/andre-xizto/points-of-interest?style=for-the-badge)
![GitHub forks](https://img.shields.io/github/forks/andre-xizto/points-of-interest?style=for-the-badge)
![Bitbucket open issues](https://img.shields.io/bitbucket/issues/andre-xizto/points-of-interest?style=for-the-badge)
![Bitbucket open pull requests](https://img.shields.io/bitbucket/pr-raw/andre-xizto/points-of-interest?style=for-the-badge)

> Este projeto é uma API que cria, lista todos e lista os mais próximos Pontos de Interesses

### Ajustes e melhorias

O projeto foi desenvolvido com o intuito de ser uma resolução de um desafio do [Backend-br](https://github.com/backend-br/desafios/tree/master). Sinta-se a vontade para refatorar ou adicionar novas funcionalidades

- [x] Criar script para popular o banco de dados
- [ ] Adicionar validação dos dados recebidos

## 💻 Pré-requisitos

Caso queira rodar este projeto na sua própria máquina, veja os requisitos abaixo:

- Java `21`

## 🚀 Instalando

Para instalar o Senha Segura, siga estas etapas:

1. Clone o repositório:
```
https://github.com/andre-xizto/points-of-interest.git
```

2. Entre na pasta raiz do projeto
```
cd points-of-interest
```

3. Execute o projeto com **Maven** ou **Gradle**
- Maven:
    - ```mvn spring-boot:run```
- Gradle:
    - ```gradle bootRun```
## ☕ Documentação Senha Segura

#### Cria um POI

```http
  POST /create
```

| Parâmetro | Tipo       | Descrição                                           |
|:----------| :--------- |:----------------------------------------------------|
| `name`    | `string` | **Obrigatório**. Nome do Ponto de Interesse         |
 | `x`       | `double` | **Obrigatório**. Coordenada x do Ponto de Interesse |
| `y`       | `double` | **Obrigatório**. Coordenada y do Ponto de Interesse |

#### Lista todos os POIs

```http
  GET /list
```

#### Lista todos os POIs dentro de um raio

```http
  POST /near
```

| Parâmetro | Tipo     | Descrição                     |
|:----------|:---------|:------------------------------|
| `dMax`    | `double` | **Obrigatório**. Raio         |
| `x`       | `double` | **Obrigatório**. Coordenada x |
| `y`       | `double` | **Obrigatório**. Coordenada y |


## 🤝 Colaboradores

Agradecemos às seguintes pessoas que contribuíram para este projeto:

<table>
  <tr>
    <td align="center">
      <a href="https://github.com/andre-xizto/" title="GitHub de André Xisto" target="_blank">
        <img src="https://avatars.githubusercontent.com/u/35929740" width="100px;" alt="Foto do André Xisto no GitHub"/><br>
        <sub>
          <b>André Xisto</b>
        </sub>
      </a>
    </td>
  </tr>
</table>

## 📝 Licença

Esse projeto está sob licença. Veja o arquivo [LICENÇA](LICENSE.md) para mais detalhes.