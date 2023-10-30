### Ennani-abdelmalek-enset-adria-test

<p>On souhaite développer un POC (Proof Of Concept)sous forme d’une application web basée sur une architecture
micro-service an utilisant l’écosystème Spring Boot et Spring Cloud coté backend et un Framework comme
Angular ou React coté Frontend.</p>
<p>L’application doit permettre de gérer des porte feuilles (Wallets) de devises ainsi que les transferts entre les
portes feuilles. Pour faire plus simple, cette application se composera de deux micro-services fonctionnels :
• Un Micro-service qui permet de gérer des « Wallet ». Chaque Wallet appartient à un client. Un client est
défini par son id (numérique auto incrémenté), son nom et son email. Une Wallet est définie par son id
(String de type UUID), son solde, sa date de création, sa devise.
• Un Micro-service qui permet de gérer des transferts entre les Wallets. Chaque transfert est défini par
son id, sa date, Wallet source, Wallet destination, son montant, son état (PENDIND, VALIDATED,
REJECTED)</p>
<p>Les micro-services technique à mettre en place sont :
<ul>
  <li>• Le service Gateway basé sur Spring cloud Gatewa)</li>
  <li>• Le service Discovery base sur Eureka Server ou Consul Discovery (au choix)</li>
  <li>• Le service de configuration basé sur Spring cloud config ou Consul Config (au choix</li>
</ul>
Pour les micro-services, il faut générer la documentation des web services Restfull en utilisant la spécification
OpenAPIDoc (Swagger)</p>

![image](https://github.com/Abdelmalek123-Ennani/Ennani-abdelmalek-enset-adria-test/assets/67714218/5a0135df-721f-44d8-ab88-01334fec8ed7)

<hr />
![image](https://github.com/Abdelmalek123-Ennani/Ennani-abdelmalek-enset-adria-test/assets/67714218/1c863469-c1a3-4964-bfe7-6bd803c8feb6)

