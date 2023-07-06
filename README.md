# market-indexes-tracker

![GitHub language count](https://img.shields.io/github/languages/count/ImGabreuw/market-indexes-tracker?style=for-the-badge)
![GitHub forks](https://img.shields.io/github/forks/ImGabreuw/market-indexes-tracker?style=for-the-badge)
![Bitbucket open issues](https://img.shields.io/github/issues/ImGabreuw/market-indexes-tracker?style=for-the-badge)

> O projeto _Market Indexes Tracker_ é um aplicativo baseado em Spring e Java que recupera cotações dos principais índices do mercado financeiro do Google Finance e as fornece por meio de uma API REST.

## ⚠️ Pré-requisitos

- JDK 17+
- IDE da sua preferência (sugestão Intellij IDEA)

## 💻 Tecnologias

- Java
- Spring
  - Spring Web
  - Spring Data Redis
  - Lombok
  - JSoup
- [Act](https://github.com/nektos/act)

## 🚀 Execução do projeto

```bash
# Clone do repositório
$ git clone https://github.com/ImGabreuw/market-indexes-tracker

# Acessar o diretório do projeto
$ cd market-indexes-tracker

# Abra o projeto na sua IDE favorita e execute a classe MarketIndexesTrackerApplication

# Executar localmente o GitHub Actions
$ act -P ubuntu-latest=quay.io/jamezp/act-maven
```

Acessar: http://localhost:8080/api/v1/quote/.INX:INDEXSP

## 📫 Contribuição

Para contribuir com **market-indexes-tracker**, siga estas etapas:

1. Bifurque este repositório.
2. Crie um branch: `git checkout -b <nome da funcionalidade>`.
3. Faça suas alterações e confirme-as: `git commit -m '<breve descrição sobre a funcionalidade>'`
4. Envie para o branch original: `git push origin <feature/funcionalidade>`
5. Crie a solicitação de pull.

Como alternativa, consulte a documentação do GitHub
em [como criar uma solicitação pull](https://help.github.com/en/github/collaborating-with-issues-and-pull-requests/creating-a-pull-request).

## 🤝 Colaboradores

Agradecemos às seguintes pessoas que contribuíram para este projeto:

<table>
  <tr>
    <td align="center">
      <a href="https://github.com/ImGabreuw">
        <img src="https://avatars.githubusercontent.com/u/60116449?v=4" width="100px;" alt="ImGabreuw"/><br>
        <sub>
          <b>ImGabreuw</b>
        </sub>
      </a>
    </td>
  </tr>
</table>

## 😄 Seja um dos contribuidores<br>

Quer fazer parte desse projeto? Clique [AQUI](CONTRIBUTING.md) e leia como contribuir.

## 📝 Licença

Esse projeto está sob licença. Veja o arquivo [LICENÇA](LICENSE.md) para mais detalhes.

[⬆ Voltar ao topo](#market-indexes-tracker)<br>