# Desafio Serasa Consumidor: Vinícius A. Arce

<h2>Armazenamento</h2>
<h3>Base A</h3>
<b>Desafio:</b>
<br>Extremamente sensível e deve ser protegida com os maiores níveis de segurança, mas o acesso a esses dados não precisa ser tão performática.</br>
<p></p>
<b>Solução:</b>
<br>Optei pelo Oracle</br>
Seus recursos fornecem flexibilidade durante a implementação de criptografia, e possui funcionalidades para a prevenção de ataques cibernéticos.
Ao me aprofunda mais sobre o sistema Oracle, validei que o sistema conta uma ampla gama de recursos para a segurança dos dados, como controles para avaliar riscos, impedir a divulgação não autorizada de dados,
detecção e relato de atividades no Banco de Dados.

<h3>Base B</h3>
<b>Desafio:</b>
<br>Possui dados críticos, mas ao contrário da Base A, o acesso precisa ser um pouco mais rápido. Uma outra característica da Base B é que além de consultas
ela é utilizada para extração de dados por meio de algoritmos de aprendizado de máquina.</br>
<p></p>
<b>Solução:</b>
<br> Optei pelo MySQL</br>
Ele tem uma boa performance, as conexões com o banco podem ser criptografadas. 
Também sendo possível com Redo log, rollback dessa informação caso necessário.
O log de redo pode salvar recursos de segurança contra falhas, o que pode garantir que os dados não sejam perdidos quando o MySQL for reiniciado de forma anormal.

<h3>Base C</h3>
<b>Desafio:</b>
<br>Não possui nenhum tipo de dado crítico, mas precisa de um acesso extremamente rápido.</br>
<p></p>
<b>Solução:</b>
<br>Optei pelo MongoDB</br>
MongoDB evita a tradicional estrutura de banco de dados relacional em favor de documentos semelhantes
a JSON com esquemas dinâmicos, tornando a integração de dados em certos tipos de aplicativos mais fácil e rápido. 

<h2>Tráfego</h2>

<h3>Micro Serviço A</h3>
Acessa a baseA(Sensivel) e buscar os seguintes dados:
<p></p>
<li>CPF</li>
<li>Nome</li>
<li>Endereço</li>
<p></p>
<pre>
{
    "id" : "797.024.160-35",
    "nome" : "Rodrigo Victor Arthur Assunção",
    "endereco" : "Rua Ecologia",
    "dividas" : "1.250,00"
}
</pre>

<h3>Micro Serviço B</h3>
Acessa a baseB(Critico) e buscar os seguintes dados:
<p></p>
<li>Idade</li>
<li>Lista de Bens (imóveis, etc)</li>
<li>Endereço</li>
<li>Fonte de renda Base</li>
<p></p>
<pre>
{
    "id" : "797.024.160-35",
    "idade" : "36",
    "score"': "800",
    "listaBens" : "veiculos, imoveis",
    "endereco" : "Rua Ecologia",
    "fonteRenda" : "Sônia e Bruna Filmagens Ltda"
}
</pre>

<h3>Micro Serviço C</h3>
Acessa a baseC(Rapido) e buscar os seguintes dados:
<p></p>
<li>Última consulta do CPF em um Bureau de crédito (Serasa e outros).</li>
<li>Movimentação financeira nesse CPF.</li>
<li>Dados relacionados a última compra com cartao de crédito vinculado ao CPF.</li>
<p></p>
<pre>
{
    "id" : "797.024.160-35",
    "ultimasConsutas" : "Data, Empresas",
    "movimentacao" : "Data, Valores",
    "dadosCompras" : "Extratos"
}
</pre>

<h2>Interface</h2>
<br>Optei pelo Flutter</br>
Flutter vem de uma plataforma cruzada, você pode usar a mesma base de código para seu aplicativo iOS e Android.
Isto é, você  definitivamente pode economizar tempo e recursos. Com uma construção em Dart, uma linguagem simples de programação orientada a objetos.

<img src="https://udop.com.br/guia_empresas/upload/fotos/10ml7amr8ev3rrejeqflbgdrq9/e4afd6ed02538ab11ba30850d1885dbb.PNG">

<h2>Melhorias</h2>
<br>Gostaria de elaborar melhor o Payload.</br>
<br>Implementar as demais opções para base de dados, Crud feito no MySQL.</br>
<br>Criar um serviço oara gerar o calculo do score, Com base nos dados da BaseB(Critico).</br>

<h2>Considerações</h2>
<br>Optei por criar o Rest em Java usando Spring Boot framework, fiz essa escolha pelo desafio de sair da minha zona de conforto.</br>
Considerando que venho do desenvolvimento de jogos, trabalhando com linguagens, fluxos e aplicações diferentes.
Não tive o conhecimento necessário para implementar 100% o desafio.
Foi uma ótima oportunidade, e o início de mais estudos que estão por vir.





