# Necor Bot Starter

Necor Bot Starter 是一个自定义的 Spring Boot Starter 项目，用于集成企业微信 **(暂未支持)** 和Lark的机器人功能。通过简单的配置，您可以方便地在 Spring Boot 应用中使用企业微信和Lark的机器人发送消息。

## 功能特性

- 支持Lark机器人发送卡片消息
- 支持区分消息级别

## 快速开始

### 引入依赖

在您的 `pom.xml` 文件中添加以下依赖：

```xml
<dependency>
      <groupId>com.necor.bot</groupId>
      <artifactId>necor-bot-starter</artifactId>
      <version>1.0.0</versincy>
</dependency>  
```

### 配置文件

在 `application.yml` 或 `application.properties` 中添加以下配置：

```yml
spring:  
  application:  
    name: my-app  

necor:  
  bot:
    lark:
      url: https://open.larksuite.com/open-apis/bot/v2/hook/xxxxxx
```

### 使用方式

```java
@Autowired
private BotPusher botPusher;

botPusher.push(Level.INFO, "test");
```

### 结果展示

![1](data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wBDAAEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQH/2wBDAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQEBAQH/wAARCAC/AiIDASIAAhEBAxEB/8QAHgABAAIBBQEBAAAAAAAAAAAAAAcIBgIDBAUJCgH/xABOEAABAwQBAAEODAUCAgkFAAAFAwQGAAECBwgRCRITFBUWITFBUVaT1vA2VWFxdYGRlKG00dNUscHS4RciJEQYIzJTYnOEwvEzY3KDw//EAB0BAQADAAMBAQEAAAAAAAAAAAABAgMEBQYJBwj/xABQEQABAgQBCAUGCQkGBQUAAAABAhEAAwQhMQUSQVFhcZHwBhMVsdEHFCKBoeMWMkRTVGSSo8EjJDNDYpOipOEINEJj5PFSgoOEw3SUsrTT/9oADAMBAAIRAxEAPwD74KUpSEKV+Xva1r3ve1rWte973v0Wta3hve97+C1rW8N738VRo/3TpwU9yHFNs6zGkMc+x5MH87izN7ipa/RfDJq4Kpr2z6fB1t8Ou6fB0dNcKsyjk/JyULyhX0VAiYrNlrrKqRSpmKt6KFT5iApVxZJJuLXjnUOTMpZTWtGTcn12UFyk58xFDSVFWuWi/pLTIlzChNj6SgBY3tEmUrhDyQ4uzQICn7ImPc49e2fD3SD1m4w6b269By2UVRVx6bXt1yeeVum17dPTaubXLQtExCZktaVy1pC0LQoKQtCgClSVJJSpKgQQoEggggtHDWhcta5cxCpcxClIWhaSlaFpJCkrSoBSVJIIUkgEEEEPClKVaKwpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQrri5caAFEjhl4iOEiGLokSfOMr4oM2LJHNw6cK3tbLLrEkU8872xxyzy6Otwxyyva1+xqmvOyRvAOh3LJormlaVSoHHHeaeV8Mrs+wEj6yXXY9GVsF8gKaK2Nr2sqioojn1yameOXmOmnSJPRHon0i6SqkioORck1lfKp1EpTUVEmSo0shagQUonVBlS1rF0IUpQcho9R0J6OK6X9LujnRgTjTpy3leioJtQkArp6adOSKqehKgUqmSaYTZstBstaUpNjHmXyW5VzzcxMkIFv3kb1ukuugNjbJfNqqWa2vkli9lCrfPHMis7wt2awxXNQYP6cEkUVnCar5zTJSFywtGJJMhwRy7ikRcCm0lMI5tsGolY45yaDMXGCy6a6vbbrHsFsmiDiyKmaWLjsV10Oy2V1FrTDYEtjXdXsSkVx2HruMSFpZy5bP3zWXyNIaq3Zqtck1ELdp4O7rO8VklkMskLIWyzUuoh6PZ6M4dI612+YRgU+70oNI3w6cMbEtjYEHpWDousc3Altczgs/aIpnF1LuUsk2+WFsl3vYWza6lvmbkzyf9NPLXOyt0w6Q9IqBM2ejKppZmXcrTaFc6dTUdTOlGhkJydXyJeRMm1UsIqqanNOZUiXMl00tKs2ZH0/yl5UehPkLpck9DOjHRqvV1E7I8uoTkTJEiuppMqryhQyqlOUp8zKeTZy8vZToZq1ZPqp6qgTq2ZJmVC5iBNkx4k6s37tLQchSkWuZI6H42VtmTj7rJR3GJAljbHHNuYCZq2bOOyJYWSTepWQKMrXvmwftVrWUt9K3HHfUZ5GauD7Dj2OLJ3nnmKlMfyW7O5jUmZppZvxSyvWJ3WQzTXbkBrrseHbYx60WUTRcZLtkfBzlzoCJRKWmyWoWa4KChNXa7nzsKfImFTN8ZqVLDLKN8Dqiz1NdLtRms7FvVknDe6jqyVrKJYMcpp6kTMiLbau19f2WVyEm4E1mWTbPPLJNEjF5ENCYLJYXvfFLNw2l+eC+WFscl8WzbFXrrN0bYeu8gfSrpj5KfK9S+SXL1aqv6N5fqa/J0mVLqZtXk2mypIRVLpcrZEVNRJXJp6yro51DUS0yadFRLmmpmyVTKaQqOr/tG9Eegvlj8i1d5ZujdAMndKOi9Nk2vqZ82lkUWU6vJs9dEisyNl5NNMnyZ1RSUFfJypRzOvqZlMZQpZU6XLqqiWPfKqQf9OiAZFlkMI3jgFRSdo3ekN0cYQB+xZmRVZqNF4hJN4hyg5ndFHJxZwWWYFcFb4tlwKON+2bXfrz918O3aJiIkckw5cDEmtyGCLGPteErII3RyKPVEsBTXZGCU6RY5J545t8ZRhiWunlbJe3Rlje/0ykpQc7PCCzAZ8woF85yCAXNhY2j5TzCoZuaVB3fNSFGzNY4C5iw4ze95LH4dIoTqbaM4ZTMKVNtco/fWqbMQgKJ4Cc2xmQnNkB4pk9euc7rDEAR453RYIuH7TJVqgopbnRjaU6IOI2PmPH/AGbCHhx1Zg+JYmNXTCLAnl2jx3bN8SiuwH8ixFZYM7t8S7iIM22Dxdq2cWQzcI3Uq3jDnTuC6YZSTj2rsQlGs5DIdjuZ3reCHJaOhGcnkvXx0V3cE5hCMvLknreRO49C3SGagkW+cBbXUMxloZ6fRkdhMUMiipHVwEPcfJJkRFoJcB91jthi2q0ikDuNqpbaxYKh26iA1Yeq0ujFGijcbdACmk0do9lxv1aM1RABIKgGC1qxUBdMxhYAgqQAQxu96has5IJN813KUjBL4ovckMlTgghg0XLYbZwJvmijSMFrRlIxOoxKDbhROz2GyWEqL5WRPCWST5u3AHGLF69YSPIymgjdUI2dtElDaOSGPSDkPGAGWpezR6cK/wCrV2Tkci3hE0MORYt/HypxFZxlEo3KBjswjkwbovY43KYkmbB2qeWtYSwXcZQxMAOzpuZkRfXsIk4zUE57mW2pGpB3Jh8/2IizzxYKEdVx+QExd4q8Ph26AGef6srwImSANWlwg9uVwxJrc/bocRsVXWOxMIbsQ+BgpwqijAM9eTOLngj9hCZeSWKjmiwsQeTfOS7WHhI9IBOWAdgTZp5gDiir1ZZOBLlunOwIU4Spyk5pISrEBWcWD5oIQ/xiQJK1sWIdwxKSAoOASNLNcs5dWgAEynrLckqnBxgPNwUDHhh+HHZnGn4idEZMRdMgcjHR7NmaEu4DF24h45yJJOk+0DB9LCyeaF1Mr3xVvCJHmJNAQt0QkujXcbUTRHO0Uzb7cQtJBlko+zkrglYlx0ZFnicNGtESsgdQMNPhbRk8SXWJot+scK8t/HJ1B89PxllHSREmb1SvrqQE2UTJS6PA3slmcHfTRco6RGvI8MsyB2kj4MvLErgXrtki2XGmEbqinFKRfHOeOwT9Y/oZAhNSqEBexiSZ8f8AWEfcx+72QPG5Jq0hEU2YC1HIUwrO9yDu21wcEIPMHOCcyFOQ7UYPZaypUhTqXmhJzc0ZygT6ZBIJUPRb4xLkMc0PaKLXNGaEuVMSqwYFkkA2xckABne5wMevmr5mUn0GDy43GXEOek7kslAjvI30otmZN6yZv0spLGYad7SLsmyBdlcrGAzuzJ6h2Znhfw5fmq5+32jAwU7ZssB7Q/crm1apvu6NsG480RFIKZOu1GXSq4SY4uV0O18e01lVGfZXHYO2Fajaoj+yI7p8ZqEVFDIOd7AJTBSWyrPV0E1dFtdRpI64jDo7mP14KHw99LygEegvFQIgrMSLsg7RNvz6kMasXas3wyPPdFyBvCQsdKktPSl8ywizkCydFl9byZZng3Ji5CNZJKum0MkjpriaaSZq2zGx88+MpSTuUKeDyGGC0JBmBJD55KGNsxJUCASbu4KXuQgn/EnO0StRCCQQM0BTi+cWIdgwa+c1gVAaC0wSgxcO1dPVLvu1R49wScpi2BAoRVSbJrLKpshYhs8Kk3d00csWo4Y0dv3q+WDZo1cOFEksqcR3mWFkQ8ARY69227aFlm9ipFAQ0BDIwyIzu0BDEyKWyy2uZOZYkCarVVReHxaS4MuueM1ssng12ljbuZsXZFiQYMiLgM7IBnjFmYappKuRbtwi5RRItkl7ZIquGCqqbpJNbG6WaieGKlr4XvavOaHcfJnBdeTRkGgSyDxhaEox6NNpDHHRiYLx/bjjYUhMN3b881j4tcwIyEMkECRwJiTkLAuULpslyFyZD+bfKLlXphS9I0ysirqhk4UOWZ1WqRSzaucmqopFJVZNkSQmXUIQKlMuppzKVJlqqfOAilXMq1S1SP0fo5SZFnZPUquErzjziiRKEycmSgyZ8ybKqZiyVSyTKK5czPC1CX1RM1KJIUJkvTvm1rzX05mkAMjpc5LwZgq+KrspFqpBFbBIOFN5XTFmtoiJQMH3aHWaffNJo8Ah+LpJ2gpIsLt8sry5BN7R2faoX3COyLsIq0Zyp86Tdk40WcpN4c8KMy6qBKHyaURQm3yzEOlWL4PJSI942yRWTd2xzv1nk9s7UXKaTT/Zhc495IlRkjD9aBjQM5I04DB52/h8RJrENfIRneIPF2oANlpECFDZHH09dqotXKL7YRR+m9WQtHx70/t5rowBpSZvdkugpU3J09lSnbJhgpImkHDnHEbF6whIAbJpfkLaScAEH5O3CEkLRELGzBJxFJBIHhJmkJ/McgdPPKDXdJ8s0VXk3LQyWiRlvssVFAKUS6uXlSnpcky6mdKUtXVLlTSozlL6sUgnVVYZC5JRHqMo5A6OyMlUM+TVUJq1TKDzsyqkzc6SqlXNrVSkKAGclaWzAnO67MkyOsCwY9DQshubEijjF06uzLjmJVn2VW2WV2pBsk7b9ksmsuhlldJbDruxqKpXv09Ypnj0ZXkNDO6iCKmXRa6iSed7W8XTnhbK/R8nTeq1a2EyyFrPNekRPbkJANsM9fTJsRZK9bHOy4osYVIxjlyiYQPRpK92Q0mxZEQheONGDh8SYHrOh69k2tr4tm+OVr2yxQRte1/Ha9k8bXtf5bX8Ff0p0CrqytlT1VYqUTUyZSamTUJmgS6uWtUud1RmgJmSlLSvqZ8p5NRKCZkta0ZpH5plyRJkLQJJlrQVqMpcsoJVJUApGeEklKwkpz5a2XKW6FJSpxHGGP8Auk2Vcdi7D2MiXYdZ2TsnT3KLPRfZeu6xPo7P2n2fsfW37F2TsXXqdZ2TKo+8eTk60ok37Z0tjJXizuQOLtBMwkT2ykOB9z1V54ktHdWyezGPjUSjJtKMZUnF3wkut2qFbykV1p3K14Jo4Zsl0XKfY1MzMid449fhn0t38gKPminSnlnjbsrVwir1l72zT6/rFMcFMc8MfJ7YOoB8wwPDXGvZtrIJa+3iUBDN+P5WZsFc5zjDEoy/7Th+pdwCYQ0ydRo2uXRw7ztnh7OmLlm1a4El8sv02nQhSz1gdIuR6TmxwzSFYs7A20hr+anKUlPoFlHA2bEY5wIwJ0i+uLw6x35I53FB8nMatKx9bGTtY5LoyOym5aVwXEkDZFhr4yAkGsoQUJY9lIsESne21Mj2Q581NsihdlgQxH8kryaiA+UQiOt4rtZdOXkC7Bd6+0pvAIuN7mhXZVFVkLJaxScyC7hZvg2eJDs8biGiiph/ngwarZWqTrmE4RkAHyQ1XJj5YJu8PsFFQVpwrGlofDxICPj5M9YKSHSfHhk7IGEA+V1o/r+FPjx2+aDGyUmIpunWcsj5GOabMgVxUe2Wy1pBDMpNAsn2n+Szw4itLYuvH7RUdH1+PgwRGoiGekHjwaq6nZuw9ljgNZsxgfBiwD6KlS85TIWQAosCQ3o2FwpRJURm2DgEkKAc1ExRAdSQXF1DG4dmzQAwOdcsbWJAFwkZ3B3KbNVvMoo4SIiiZ4eojIhCqb4GEUxRMmWeabzLFyKELZ4JEyKF82bBTPHB0sllla1+LlsjX1iwmPJzmGqyOQicDsdj2EoCXNyAOs2XeNyoUXi9yfFBjhs2cOEX7Fu4aqIILLYK5JpZ5WoRJuN24FkJstHGLds7GzE9BtaJd1wqSWWlNmPpc7nz1XDtlJuys1VnqDlIa6SuVcK69HXQaK9sj8cM2LaMmrTaR7sY3YxiGm9iaxm4F5EjmlBUUFpw4cBDpJTVzLg6220XEbwDOl2rGDOXooyKIYjkO4rl4VztTqpXzouCRcBj6JAOLllYOHUlSQzPFusmfNnEazoL4XFwQ97EFjgZOacqocS0md2mJzjJaUxmF2mB/Vw6ci3h8KnmrgmizMKtmSxEXgtZRLJN69jqOOdlU7Yt8uvxveZRm2tYlowRmTPYkDXjIPJJGRH20xjzkFHnilm9rsTRlJ/ceMdYKOkErovlmyt81kcbp2yVwxv5+vdDbfk2pAsOx1Y6ixaBaQ2HBb4FJBrzPv7kk4MA3aTQFnH5YXboCG/cl4UIEJY5AKKvnqGKQ5dVR05QlqVae2LhsSTzMNFVSIIdKeOUrHxscVizNWaoa6EnxEjFMUSZZgOZkgWRMaSGXkLoKNerCGqLQhjdNFdvJlyWssA5ysFpIzc+WkJe4uFKUlWgPnE5pIgLmM5STZL+ioFylRJbGxABGmxDOAbYkdoa0EAg0pLbEgouMyPNJKPSMjLQDIEdUXwzVQTDF3JBIeUzWTTUUSwYuF8lMMM88LZY45XtjjfcIBKVbJj8hzHRsfr4jCRaBx+YS6yRPpuCSMD2LFjm1QUxJZuFsBY0YzcFHxp1mniyRs4VTa3qiy1DtOOZKTDLXC8pxlLfkM1vqxmfhaasH/1fMiywK5F4bkbGOLtuwDHDCY97Jooo0zK59xmkgQs4Uz4sK0Dt3Wk2Q2CkNtO3kOjurosPiqx0MiFk12OshcNk0xjixZ63XEymKEGyjVi8kajG5SJrnhg5Nq5LYuM4EqVmq/KJJY5oKki4WkAYgB0uCpXosrOAZJMTnrdPoFnD2Nhmu+F7nAXBDHGJjQ5ZRovg9QiEdWmhnGcqRkQDEySPBXJSPtBQ00/krl/OXMRCgyKbFY1gPhZQmifKPo4Ybo2TQEyN3H+a/wCV0RGa9DbGIw6XiRMjlj6IgUTx3UQBAo4YjiBGx1tKy20WsAVir7EY7bijaEuXxMLYJ5CG75u5arL11V47TAurLpfOZ1sbBoI2yXfy6INIylKohNRr8DGlHE1imtDWsdnspEXEm3LnvYyzhh3G48K2Ej38bdsMzrXM8Y3tvDXWlSeRvkDL5JfYsgNrKNgmqWOwosDcxnYDAfj2vsmIxiMCWbxs6HXeo7CSVIssyFhQi49xYWKb36uSyWzTe5KlpvmFTZ2bmsWBJYEPrICa5027uLWYJP8AiAdnd7mzsWwDEqkbXHL2Gz+RxCGZge50nlearTsITaOhNiCx5JqHfGXieV4Btc/K1hmCQ5yigYWhzJvmtk1wdpMc3OGFszw3LsQhkHdhOMe4nQV6s67ovDJvTEWLM2SaK9mbljGzW1ESbhd09TRSVYnLRhdqxWye9K6yeDBeI27DajzYGqXMnHckyAATMCZAplsgfxbIxpkh3hTNni5VT0OgvL03aiztJk1ye4dw1s3d2i/XkHA1POCpXr8MrYY6fcYI3DVym2EJRFiKHFpLaAhnqe8XKj8Bk5i+qhbGUpmrmLNTBeMyl+NdJPDg649yUtHybEQ6uUVBgi6cEqVMDurBloUSwBIGcwDtrZ62uVWUQ5CUFmQXLpUkByQ9nJG8X5Q22iiIZFpPA59B+256K18qwlDOM9ssiBy7NAScWdx+VHwruLviJBiHTLCCxPLAo4u3WapYNnirblx7ZC79+BjsjiheNy0y9mLVUVhl3RGM2sOWb4rnUTLluHUJx0ugRDKCCjMXl2RyVSHvG7N21fJt4Fj9oO31YT18w1aeJuZa7JJKhtScZprx3HuCCOLFducQT2eoOjEZNBEsB5AdJpHOGdnxISlhH8XJVikLtydbr7Mg0icyDkFHzUimRYOKiUcl2so8TmkOYR5pkm4TCPh4Fm5l4OXHSl1zM4kZKNMNdLrMg6I2QD0WbUXhkqWllMGIJYF0qVgBmoUSpnJJdz6IAJOcIvnF03cFnNlAaSCoAByGZrXJNs0xjQHmEVk75caIiOq8XCTnLJy/Jb0ctI/HRrcVOjBK85LtdUkM4mdGM4Oqq9CKMSKCCJRouuYRSwyyzyxXlTZvrR9M0YU1l8msdkAuOxbWMrczYLKw8Ycj0Ts1FzZeJx5q3hQjF4piTk5AM1CtHzfAd28q5eNrZUycQDZmGAF0gO3mqWYM4cu1RHRqbxRyHkCgDaxltrpjJ4RH4MSQii60gEReRzB0cfMgDiRPbG5fjYf2FpM941MiOtxwxdlupHZ7iTyuz/Xcw/6SWw4skiRVRyQgjqbtNza81tJogPGWY9fMZ3N5FFj7bM6wZjrEHruMI8hUqQCn0QxKXZSjocv6ThJs6mDA4hwYzC5he980s4Au4FrMSHLAlyWtYiLQwjkAxm8wbw9trmei1VAWMkdH1SeppNGRAl0yTIB1zZPXW0ZsoLUkrVZJeMIOmmCp5tdV+OxXHNHrxthuHLWJOQx14PjcrcHE3mKkFjTmH7LHvdhxhwbFAR8qj+bnXfZCbR2sQWKZDYo0l5VuBa2f5Ns3Kjgezh/WWsjISexSLqBQrK4saSV2MS1FpTePGoAuZAjUshir6WAZ5GtXbfRdSFa7RiinDijR2KzJuGY0UNdu0rYzrLXL5gSjZqRQPfmv1IrofPNpLjDiTbGfjJsjI41i1cwCLCJVsgkESyaZkMHmuso1GMi4FZ+OJw9UTi/Sb06uS6jcsEFIBzQXKnspRmEKYfFDgEEWIMM+awwuSCTdviAXSM0ZucTc3IILM0XHR3Q2kq7NtrgOnKn2Ts2NKx+SPS2rZoGeimwlXF8vDJ9GRJ1zGmqpsXjJDDZvm+ENyI9YQDk7h1dil+Cdwkjp/KOjNdyTEgm6hqbxIpZwLzBM5AzLPz76S5KDFWonGOoh12o5NF2Qxl5J0PSDL4jnWRVGsJtjOJfHZci2hcgcNpUY3rNcXxbVxkYQdJC9MjoEAxHhJcDVkMKLzGTPXTmPssFWkndCGDlkis9YvHnZ4ZGaHl0JkmnrONaDLlrSXWx/NeIw2IE3LFkxkIpclctJ4pwX1w2jb1ug1c5kGp/eMfeJI2zzIOjKCt0SMJkoILkA5rgEkqcXLsUuzEMEixc3iTMWC7Ei2DAXAZrE31kl9GEWZecntkryc+0j+pmb+NxqSS+JrrKDeSJl8Xex413JbFGxrXnGKeQ9g3vZm+zdim5iQur5umqar8Yuwct3eWMOVgRGH63lcsiR8BjOZDKgxXAcC2HIxkTZxJSVovyr4ohrge4wy7LGbLLhj4mLmh4t0+Lv2SDEAVUTqxKdQgUZkWdyrWs3GkZLI7S+Rdg0zBd1JtGkv7ZNmUgUvGcI9t5GTAEktkJ72T87YtUb4/8ACSO4zBo5cyDnqbB5H9KaudxPbo6FjZRKDne25YisApMAbiswkKBWYnNZRCOpQQ4NMn2sWd6/7qxqOq5OnwJkMmolHEra5lyGQ6SHuSFG6QhRIBJIUc5sNVyBFQua5DjRYgYlaBdmKQxOLbA8TDr/AJZg5ubGC1IFsIa1kARQ8CJMte7ZPIKD3EicCATstm21k1YMhZ8Z2kaayMWSPRdrfIoPfm2+Q5s6K5FI+ROMHxDqTjW2wg6OTs0yl7wNDZ9MBMZsPVWbDDbM/HYQ6AHI0ddN7ptnCxQJI26b8OutFbpuiHcmjOpeORQURgkqP6K2pkxZQuL3JYrQHhH2e8kZke3yKy4s8wSnWIu7S+FrknrdLbiudlGzp5d4mgljkhGKZlQDvXTmE7g05H8zMnfNXUfjPJ4wwbRWQS4tL46OBaq0M2w1HgtmIMsG7ghKJV3xRYkydgjOvlbj2KqIyZGeQklSQzhCs4gMXNiSw0jNUSWZrhUiZMzQ4AURbODAkZpY2a97uLPpYi4bveEqV1s02GL16yEZ2ePGZiL7UK7G1gfaOVFUcY8IBjXWmDxWXSQ52y2ZYjAgpQeodVuGjpuUZ4ds35MW2ZuUwaj4SRau1pDiRcQykb0C/wBzSp5Jx4FR0m2Jqs2aOikY4eLA81UsCgsZLc02Dh4LTJkByBYe6Xga6I59rpGPSMM9k6mMwdO0n21OMXMnkMMKJsxbdNMm1gezna0p1u9tiR7TQTSmsrBOsECC7Ago9eEmQiN9ExARGj7EiVg4SPEGuz5ETHPAfA3kNEJZcU7kr7IR3K2OMLYM4nGX49wjgmCOMSYsRHVswUkRINE3eWVeqRmrOaXBObnImkkEOm6VAWLguCRbOYgvOevOSM4MQHZSGBs9iHu7hje7OCG9AIftiHy/W7Tavbl4vDnLco7XfzBwLCYC2ogq+Du3JZ13Sci2LezlgspgtmRyTs3zSzVySUyySw3b7g1JiBZyrLaOusYuQcO2bCSXm0ZsBfOx+OWT9qzMXJ9z3Lhljjlk7QRcZqtsccrrY4Wteqw65T35A9CttaAtQywNPgTY52nJ3pjThKNq4P5i/Kr3BYW2e5eqnswBJfOPYySPs4/Y+k2SkOaQrs+SvWQHUWzVNiRmXy2NSJdm23dJ5y5fzwhqdxKUBDrSzGIiDBdnrXNrFEyXfE2yYot42yWctU8EXrlRa11iKmZlS3mHPSEpUrMAmJJUkXSAL4jAu72zYsFrZAzVOQnOJQQASzk4YamA/as0Wd1/tsFN0nVnKokC/wA57PIPHRi8gZunkqygr52i8JBUVEWCz26o5moYcsWKL641lbNVV0ugnk5vLNU001qKfa92rLJsUGZlBewJls1q4QIFAq7jXwFzJS8qjUgjF27nPLuHOsskGcrBY9kP4nO9kk7wwGjHbcXcuspgSFegQQQDYvfSNdsL44ixEXQVFPpBjqO4X1XxthgbgwpSlUi8KUpSEKUpSEKUpSEKUpSEKUpSEKUpSEKUpSEKrBzAgb2e6MkjcWhm6KRlwzmDJqnjlmo4xD4uEiWCWGGOWea2IV6TVQSwwyzXWTTQwtbJS2VrP0ro+k2QaXpR0ey10drVLl0uWsmVmTps2WAZkgVUlcpFRKBISZtOtSZ8sK9ErlpCnDiO96MZfqui3SLInSOhSmZVZEynR5SlSphIlzzSz0TVU8wgEiVUISqRMKRnBExRTdo+YSPTAzBZKGlANZKz0EbDH0GjnJxkNfPABJAqPTINmzhtm6bYO2+GWWGKySlrXy7Eqnlfr7e+WtdzNJFqgYclWydND53IY93Xb4sXaTAAFfFR2LoazLh3ktVKvFRK66bc1gkXGqvckF7Idy887YI045JcCyBggTmOkrMr5kFl3pCBPHCA3BJ0r1yqqkXIOM0mKSLhbK+XcgksxbM8ssu03/a10WDfzPP8ZuQ7N6qzz0zsxdxfK+F8x8PNFGnT02xtfEkNZuh2WNrWx6FbO8sOtxt/u621r2+eXR6r8q39nPLOXMnVXQ3LXSfJteOqol0K8qLyFPWFnNyhR1VDSViRUTpKr0k3zarplLKpkpCyrP8Aovl/JXkh/tLZFyDlOk6d5D6IZWycTNrpWUqfJhy5JQqWgKyfXU1bW0KzTyJySRVyVVFHUhCRLnTJSQE4Tyj3RMdwbJkhSUPo/wBlH2Thal4RiRZxM4wiRctcUUTbvi5hV7gou8cvWLhd4v2NJZLteyeNrdPoB1I3VZNF1s/c5Bqo3GumLTXcacqJ54d0r2etz0nVS6+2Ns27NVlHG+K6d1E1XWb1v1yajFTC8SaY6mptvYZZm+2qlnq+EYqWWeprrMXk1Ko26MrtRopuo6QE9n6c0VHp1VFZnfocJiCWPWp5e80GhMY1vEQEGhopALGYyPSGiByF8ssUUMMslFFFVVL5KuXbtwos8fO1883Dx4uu6cKKLrKZ5eg/s+eR7p1lzyijyu+UOiylkumoJ+UK/I9JlwTkZWynlTKCJ8qXPXSVAl1VPQUMqrnVKaiolSF1dX5uqnlzZJqFp439pDy3+T3o55KJfkP8mVdkrK9RXUuTMm5ZrMgGTMyNkfJWTZlLPnyZdZTKmUtVlPKc+ik0synp5tQKOiNUipmSZwpZasrpXGeuk2LN29W6exM2y7pXo8fY26Wa2fR0+Dp63C/RVfy5B0ZXUVIZ4r2yy/2oX/6xsja179bg3Tzt1mGOPT0WztjZVW2OOS+ainTlf++coZRk5OloXNStapiimXLlgZys1iokqIASnOS5uXULM5HzBynlSRkuXLXNSuYqaoply0MCrNYrUVGwSkKS+JJUABiRYmlVc7QZ/wAMh6lL+yl2DTyNm/1oJX/9tq6f4UU/0So4o8Y6P4XSPoU797L2bNp4bYtHSqt9oNf4dv6hP+2vztBt/DNvUp/2VHwppvos/wC1L8Yj4XyPoM/97L2bN/OFpaVVntFt/Ct/Upf21+dptf4VD1Cf9tPhTTfRZ/2pfjEfDCnGNDPH/URs2be7Xa09Kqv2o1/hW/qU/wC2najT+Gb+pT/tp8Kqb6LP+1L8Yj4Y030Kf+8l+G/k2tLmmmrbrVE8FMbX6bWzxxzt0+foyte3TW12o0/hm/qU/wC2qvXZtL/8shb5kk/7eitN2TbyIIfWin/Prf6VivpJQLVnLyeqYrDOUJClMMA6r62D98WHTSSkMmkqANQnJAe2oc29Vo+1Gn8M39Sn/bTtRp/DN/Up/wBtVauzb2/5ZC/zJJ/21ou0bfw6Nv8A9WH9cap8IsmacmEb5cgatnOlon4bS/otV6p6T4ex4tTZq2xvbLFuhjla/Ta9kU7Xtfz2vbHptf5q36qb2m3/AO5R9Vh+lfvabb/uUfVYf2+/h8HmvL6UUUsNLoZksEgkIMhAJtchJDkXxD24VPTSQq6qOpUcLzElsNY38m1saVVCzVtb/l0PrSTv/wC2teLNtfw3bodH/kp/2/06K0HSylJYUs86/Sl24kc+yB0yp9NFPGzrZezZz64tZSqr9qNP4Zv6lP8AtrdxZNOjwtW1+n/7CX9v6VYdKaYkDzWff9qX4xZPTCnJbzOdg/6RGzZFo6VWLBkyva/S0a38P8Ol8n/grewYsb3v0s2t/wD06P8AZWg6S05+TTtH+JGkga9vL2unpZTq+STh/wBRHhFl6VXJIcPvfwsWd/Dfxtkb+T/8K5OI0b026R7L7oh+3Wg6Q05+Tzh/zI9l9kap6TyFfJZuIH6RGzZtiwlKgTAWMve9rjmF/B0+Fo3/AG/lrfwFC73v0jR9/nZt/wButRl2Qf1E3B8Uagde2Nh0ikn5NMFwPjp0g7NndE6UqD+5Ir4sH/cm37VcjEOI6bdIsbf/ANC26PF/5V607Zks4kzTZ8UcMd/OFxl6Ufk8zED46dJbVE0UqHe4wf4qG/cWv7VO4wf4qG/cWv7VO2JPzU3inx38m1u3JXzEz7afDfybTFSod7jB/iob9xa/tU7jB/iob9xa/tVIyvJJbqpg9afHn2RIy3KJbqFj/nT4c+yJipUO9xg/xUN+4tf2qdxg/wAVDfuLX9qr9qyvm5nFPjF+2ZfzK/tp8ImKlQ73GD/FQ37i1/ap3GD/ABUN+4tf2qdqyvmpn8PjDtmX8wv7SfCJipUO9xg/xUN+4tf2qdxg/wAVDfuLX9qnasr5qZ/D4w7Zl/ML+0nwiYqVDvcYP8VDfuLX9qncYP8AFQ37i1/ap2rK+amfw+MO2ZfzC/tJ8ImKlQ73GD/FQ37i1/ap3GD/ABUN+4tf2qdqyvmpn8PjDtmX8wv7SfCJipUO9xg/xUN+4tf2qdxg/wAVDfuLX9qnasr5qZ/D4w7Zl/ML+0nwiYqVDvcYP8VDfuLX9qncYP8AFQ37i1/ap2rK+amfw+MO2ZfzC/tJ8ImKlQ73GD/FQ37i1/ap3GD/ABUN+4tf2qg5WkjGXM/h8Yg5alDGSv7Q8ImKlQ73GD/FQ37i1/ap3GD/ABUN+4tf2qr2xJ+am8U7Nu/httXtyV8xM+2nZs38NtpipUO9xg/xUN+4tf2qdxg/xUN+4tf2qjtiT81N4p8d/JtHbkr5iZ9tPhv5NpipUO9xg/xUN+4tf2q2chIjw3sLG9FvF/wLW3/8vLTtmS7dTN1m6be3fwgcuyg35vMv+2mwGJw5t6popUH9yRXxYP8AuTb9qtvMUL6eiwwfbo8f/Btv26qrLclL/kZpYaCjhjGZ6QSQ35vMuW+OnT6onSlQJmMGeKw5h57/APBt/wBv38FbGY0b09Fh7G3R5miH7dZqy9IT+omn1oGlhidOj+sUPSSSAT5tNt+2jZs57rBUqCWLtUMqmqN7G2vhl03Rw6Emq/XXt0puUsLWTzwztbovnfC6qOOWWaGaanRlU2snSb5m0eo9PYnjZB0l0+PsbhLBbDp6PB09bnbprsKGvk16FrlBSVS1BK0LZ05wJSp0kgpUygMC6VAhgCezydlKTlFExUpKkKlKCZiFsSM4EpIIsQWI0EEEEYE8mlKVzo7GFKUpCFKUpCFKUpCFKUpCOjk/wakP0GW/IOKgu9vPb7anST/BqQ/QZb8g4qF+xZ+b8L/pXlukyc4UOw1Wn/02w8+zx3SxOd2fbDzrvph7Y4XRbzW+y1Ott5rfZXl31SF3sJrO+DKcYi8NMDsOWuv3LB0enRuNvXMvwFyjBkDdsB+upUgyjbgfdV06lSJJ+TZvE0mKUOeoq5EEaQJbjXcbK5mM9hbqhjQpFd+bJDQkZtDqpnIriucjwFgKYKjBUI1HBBZaOHY+zf5uLin+a4274hdwGyaN27NNTLwE/KCJE5clUsjMWEZ6lLCC8jrsUyVl2dIzQoOxJSMfyeu6RSKKsnUa5BBlTpckTpq56JSiqi88JeXRz1OADLAQmYkkhS1S0kN9EXWY+b8b/rX51mPy29/l6a8puNGyo1MuC3F7LfRrlZMZDKYctJnkv1KO5lSeWlHzA8eG9fLNlca2D+R9dkitjhiGlckTTIYIN3WA9zYe3Xb7rGccICkrOQMZMOqEkZxGGQ8lJIawkHVe3crjw4tj14sgcjrd2oXEsiWP+4e6fs26DzH/AHN1FLeGrisQpEmYF0qBOlSpiUTqtMqYDNlpmhBR1anUElxdyASwEboy1ImyKOembkySKynpp6JVZlVFNUJVUyE1IkmUKWaCtMpRUGW6gkqzQkPHqn2P5fwr87HfyXt/L9a8XucG3NcT1hwr4oRx9s8eM3Zv6BIH2ewwWz4xsLLW+tzjW6+ciZ70EMNlEMzsl7kYMZDJmT3u/kLJv7kiWbdTssMbH2Po8hu+M7LlPIzku52zpJ1LIrEZYx5E9RTizkWyfrOhR0U8CKzWOOCgpz1q90gU/jq7kWssrmoKFlMnWOOM3KSJcxaBLE0SzJSpaJgKM6YlM2akEJL9XKXLWg/FmqJSoygkqjh1XSWRInT5MuSmpTImUUpc6TUoVKMyfLl1FSlKggkmRSzpM2QQM2pXMMpZpQnrD9A98MvN0/Z9taL4W8uPR9tq8eOSHIvccH458YplpncuyZCQ3Lv0XFiMlMtOOWwZwTihIZKMV40NIcatJ721i6ySfhElmBLXWtNmSJPO+bVdsXdYri0qdrL750q+39vyCPOREe2bscEpJNgTExCtwlm5p5DQb7uEq/ZzLqHsWiwgSMS66yzBpKNeglUceuJnRCSVijOk7KciUvMMmYc1KJkwuhJEuZK6xBQAsharpCkqMsB1EKJASrOr6VUlNOTKNJUrCJUmoqFHqUqlyKilNRKMlIWsTppJlIXLWuQlKVqWJqygS5n0k3wt5L3tWnsd/Paq88O57LNqcWNA7HnpWx6aTbVkRkknM9oDBdyZooKQcvnvc8KyHCmXZ188s+1x7Fo1S6etRQTwtbGrIXwt5PB+Pv8AbXYS82bLlzEuEzEJmJzgM4JWkKDsWdje5Go6Y9HTzJdVTyKqWhSZdTIlT0BYAUETpaZiAoJUpIUEqAUEqUApwCcY4l8creS/8/5Vpva1/Ha1/nrl3wv5L2v7+/lrRlh57fX/AJ8tCg7DztaLmXqPGOLfDG/nt81fnWW89/w/SuRfC3kv7+X/AB79Gm+F7ea9UKBpS3qaK5ig9vx4RtWwtb5f5eLzfjWqtXW5eb39/fw2pbHK/k6Pn8FAAMIjNL4F93OyNNrdPgtW/a3Ra1vNWnHHov0/Pb5/xv8A0vWurpDkbL8Gt7Q8aIS1zj+EbuHi+ut7Dx3+b+tq27W6LWt8lbmHjv8AN/W1chOPD/5CN0Ynk8/0jlo38P12/Hpt7/hXLtfova/mv01wk79GX1dP2XtXMrkIx4d4HcTHJln2EHnhHKwv0ZW+Xwe/11yMb9GVvl8FcXG//Zv834eOuRbwXtXKSbDXh7QPxGOprRzE4+0eogn2AxyK38L+C3R0+D+fTWxbw2tfz1uYX8dvr9/f/PJRhuMclNy2sWI12I7o5lK0436bW+TwfZ/itVWGG0WO8eOO6NQXAOsPClKVIsQdUSLEHVClKVuC452eMbguOdnjClKVMTClKU553w553wpSlRzp/pzoiOdP9OdEKUpUxMKUpTn/AG59kOf9ufZClKVBIGNuR4xBIGNuR4wpSlZKU76sW9UZKU76sW9UKUpVYrClK/L3ta3TeoJa8I0538HR0+G/j+auNnfyfXW5lfx39/k8XRWxe/Te9/PUEsCTfXfTaw2adem8ZqNsLniAPE39miNN79Fr39/6VsXv473+eted+nwebx+/21s538HR5646i5xviTaxxD+0+rax46zjssPYTwsG2ndG3lfw3v8Ap9XyVx736b3v/mtzO/Rbo8/z+L38f8vDWzlfote9ceYdVsPYwA36fVHHmFm9ZPPGOKrfpv8Aj/S34VM8Y+DUe+gxP5BvUKZX6b3+eprjHwaj30GJ/IN69H0awrt9L3VMej6KfGr91N/547ylKV6ePYwpSlIQpSlIQpSlIQpSlIR0cn+DUh+gy35BxUS9Zl5vxt+tS1J/g1IfoMt+QcVGHWW89/w/SvO9IEhQo99R3020an9TaY8t0lTneZWJbzjDb5v3s0eQfVI47rWV7i4MxuQuG8plJHkdEFieqH8nLSAaY1kMGS8hIJK+0fmWeRoyxHroKIEZu4hbsi0Z4Zh1TaY++TK/m7PORxMsZ1yfbmt4aMCSnmOZjUbY7Y5c8ytEwTZvGpiIkbPu0bm0s2nOEImzZTMTk0lxmAQ0LlBLuI2GUDNUijbt36nex28l/wCv6U7H8v4f5rwNVkZVRNmzUVMuSZy5ayPNUrIzESUpBUZgKvirds0K6wBSSEkK/J8pdFJldVVVVKr5NIaqdJnKAyZLnLeTKpZaAuauoSpdpU4qYIRM69IWhSZZE3xJ2gJ2NvzU+lNL6bkosdouWz8xNeTfJGC8vZVyhiEChus37SSPIQG3psUkN2OieL2ZCSl83QuPg4q4SSbM13bPI46bRsA1iG5e8nuqKMNPbKfOoTIdI6EhsJ3lrqakTgFHY0UGNDghn3/R8yqhK12L4ayUlg7M0RVctFV8S9u23Ced/f7rL+e34/pX5dO/mtf3+W1XXkZMxaFTZueM5JmJ6oICkJpptMmTKCChMiW9RNmqAStRWojPAAa83onKqJsmZUVZnISuUaiX5umUlcmTk2ryfLpaUSJsqXRU4VXVVWoIlTZqp04hM1CUy8zwP2O12TMgfU0tscjdXLQDki15T671ZLXj9Zgo7OAQFpk6SOs2rF257ksZa+TTPrjXqDB6m9tlezTubiMXX3uPvJfaO0NRzqc7G5NczRU0DTzbYQaN07w4j071k3FxI8TZRtG8vA8H9mCVVsGrZBM3dxPVHDTLHPJ/3OU6+9vei6f/AIfst+labp2817e/y1QZImomZ8usmAFASsFK86atMqTKE2aqnqKfPmAyypynGYq1iTVPReolVHXyMsTwFygioTMRUS11U5NLR0yaqpmUFdQdbPSaZczOUjNeetObbOV4IhFeXnMziFxpmTqLao2+xd6l33sDYZvZOtNNTJ3IdtChsqjGmgEZgEojWEZBk7lXCBFOQCA6I9RMauNP2yZPFmByNtT6E0sHwiOx3nEPYWxd4bb1xqDW090tJOp+EYvqLW+y7IqNJlups+2FpaCakj6Ai6iC5uNxKawSNSHNs9VVJL5EGT8D9Gt0/Nf7a/Osy+S/v8vRWZyKCZa5lQudNTLloWuejrfTRKlyjNlpUsZi1BK1HrDOBVMWSFEvGSuh6Frp51RXTayplU9PKmz6yWKh50imkUpqqZC5oEidMRLmqV5wa1Kl1M5axMUc41g4nx7bUS0PCYbuqLwWLTeGIv4nmz1w1BC4eSAgSDgfG5CIjkaYjwETTOhkWhFSLiGyTEOotdBFBjbpHM7FXwt5bXt9tq7O+N/Lb+tq0Xwxv5PH7+LxfhXZS5HVSpcoFSxLSlAUoupWaAkFZASFKIZyzEuTHo6ek81p5FOmZMmJkSpclMycQqatMtIQlUxQSkLWQAVKzU5xubmOtun5r/bWi+N7eO31+/8AWuxuja/i8Hv83R+H+drJLK34+/g/r0VBQP6tuwZh7DjFijSQNuvRpEcC+ON/J9ngrTdO3kv9tczLDz2+v/Plrbun5r/b+v8AiqlB0bPw1X9gjMo1HjHF6zL5/r/Xor86L+a/2XrkXxvbx2/r/Kvys80ahwDccIqUKGh93LxsdF/NeteOHivfz+L3+XorcpQBtXqDc83irHVCteHj+r9K0Vrw/wC19VXTp2B+BBjVAYbz7I38L/7rfL4Pf665uN+m1q4Hirm4X6bdHm8XzX9/5VuMRw3PZ/VjGyDfeOfxjkYX8HR5vF7+/jrk436bWrh436L2+yuThfov0eeuSguG9e0awNLjHW6cI5iTYHU3ERysL9Nujzf16a3Mb9F7X+35q2Mb9F7fZet6t5asH3HeN232GOQg+xm3Yh/Vb1Ry8L+Ho8l/f/FbtcTC/g6PNXKxv02+Xy/PW2B39/8AUNw2xukj1G42ax6jfjH7SlKmLQpSlSCxeJBYvClKVqFA79XDW2v16I1Cgd+rhrbX69EKUpVotClKU/rz3b4f157t8KUpTnnnXphzzzr0wpSlVKgOeQeOiKlQHPIPHRClKVkS52aoyJc7NUKUpUREKUpSEK2csum9/D4LeL9f/nxV+5ZdPi6ej+f+K2M8vHa31/p7/wA/FUObn1DS1rnb3Atd4oTpPxRh+0dHqHA44CNOWXT4vFb8a0ZX6LfL5Pnr9rZyv03+TyVmtT7h7T3bv6xitR9Zw1DbuA5xjT89bGV+m/T9lbmd+i3R5/5eWtnK/Ra/2W9/xrFRYHWbbND/AIBtmt4wPPO3GNrK/Te/2e/+a2VL9FrfXf7P/mtytpXw+Dp6PB+vl83nrjLOjb/TvzuWjjrLucbj1hxr1xxKmyMfBqPfQYn8g3qE6myMfBqPfQYn8g3r03RrCu30vdUx6fopjX7qbvnx3lKUr08exhSlKQhSlKQhSlKQhSlKQjo5P8GpD9BlvyDio56zH3v7+9/m6JGk/wAGpD9BlvyDis0rgV9D56JP5Xq+qM3/AAZ+dn9V+2lmzNrvsv1mUcnCv6l5oldV1mMvrM7rMz9tDNmbXfQ14F6zHzfjevzrLee9T3Suu7C+tfce+jrfg6PpfCnbunxAd0/Nf7f1/wAV+dZf5Pfz+L8Omp9pTsEfSvuPfRHwcT9L+4P/AO8QD1mX8vx/Ty1+Xte3jtep/pUdgj6V9ydn+dsER8Gx9M/lxs1TgdGvvMV+vja/ktWnrMflt7/L01YOlOwfrX3DatU4atPdaI+DY+mcKfd/nn/c+qK99jv5L/0/WtF07+XHp+W3j/Dw1YelR2APpQ/cNq1Th/ufVD4N/Xf5b38V0unbz3tWi+GVvJ0/N79NWOpVT0dSflW/8hjwnDgXip6MpPyxt1M3/nitt8cb+O3v/KtrJHzfh+ni+zw1ZelU+DY+mfy/f+X7gIzPRVJ+Wt/21/8A7F4rFfDK3k/X7PHW1fG1/J9dvf8AnVoqVHwa+u/y3v8AYIr8E/r/APK/6mKtXwv5PDWm9r28dqtPSq/Bgaawf+2Y+tqgD2Q+Cf1/+V/1MVXrXh47+/v/APPy1aWlPgyGIFbj9W9+N+/ZaHwT+v8A8r/qYq/XISy8X2X/AKX+r9asxSrDo0wH57/Le/gOijF/P8Pqv+pit9b2F+m1vD4be9qsVSrjo83yx8D/AHfT+/0473veNk9Gc1/z5/8Atv8AURX61+m3TW9hl0+C/jt/Kp7pWnYLYVVmw6j2/pnwtGg6OkfLf5fRq/T8NTnF4gi1+i9r+auRjl0dF7eG16m+ladi2Y1L/wDR9v6V39cXGQGDed7R+QwP76+0RC9r9PhtSpopU9i/WfufexfsL619x76IXpU0Up2N9Z+597DsL619x76IXpU0Up2N9Z+597DsL619x76IXpU0Uq/ZJt+cDR+p97+EX7FNvzoaP1HvvwiF6VNFKdk6qj7n3v4w7F1VP3PvfxiF6VNFKjshX0n7n3vriOxVfSvuPfeuIXpU0UqvYz/Kdn6H3sV7Cf5Xs/Qe+iF6VNFKdjfWfufew7C+tfce+iF6VNFKdjfWfufew7C+tfce+iF736PDetrLLp8FvF/P39/km2lR2K5c1OGA6m2/9LcxByC/yu2kdRc+vrsIgvLPyW+39Oj3+rx7dTxShyKSG86bX+R99FT0fJ+Werzew3fl4gPPLyW+v9Pf9a2736PDerAUrM5C+t/ce+4aNJeMz0cd/wA9x+r6NX6f1n8LvXi9+m/TW1nfyebw39/tqxlKqej7n+9tZgPN8B++ip6NOCPPcfq3+oit9bSlvD9XR/P3/l8llaVmejbt+eMwb+77/wDP2xmeizj+/Nh8l1F/pEVhyt0X/l7+epqjHwaj30GJ/IN6zSsLjHwaj30GJ/IN67TJuTezxP8Ay3XdcZP6vq83qxN/zFu+fsZtL27TJWSeyzP/ADjr+vEv9V1Wb1Wf/mTM7O6zYzaXt3lKUrs47mFKUpCFKUpCFKUpCFKUpCOjk/wakP0GW/IOKzSsLk/wakP0GW/IOKzSp0Dee5MIUqlPM15t8Qhos7qfLcTLEZuiMIS89qESyn2IECdz73c3eytJqoNy22dXOe6y7GWJxuRAT2t0HCO1R/dFxDk0Evl/k/VIZaD2M2LQzmvyKU1Bq+N85IJJD2z+SPUxI1yAFSyVysK11uSacZ5jzcgv+s7nU7uMTZKBFNka0icyTFHBDWFRR60dtWTXREorDggb3tjYsDctYYnVroVhJZjo/C+4Pfdw+1alfMNyW5jcmhxzqeGueL+6+T7/AFjuzhBL9qHSC8MGSrkXOXAF7qsRGZjsY9p3qdHVHJEMk2IiVP7yhxC9Lx2KODz9N85nwcgkKbHY0478jucWmeSPArRJjcHLUjqHZu9SWt5gy5PCdzT8lKo9lrPZE1xFrbY5Q9RW4Dzt+bwNA2LxAgx5FTmVoi2Sg1CGZR/B0WByJKinOdOBLXwDvoxtbXrEM8OzHED1qZvVe/dH1iUr5LJR1S3lbC9yDH2HJnfTpDHmbzd1ZKNamOD4PYvHsfp3RepNuTPXzeDyWD6L1HMdtT8aWiQZeQQaIcv05u+ZNFkjFo4zVfE081I84uX8F3zzS5FR/k7pHkJrnXHUlIPys1rFY5qHckK0JJnhKQ7Rdw8sH10/5d7HTisoVdB0kNiytsdfFpdH0B8TQZw56EyMunULtcXAI+NpISA5SAC517cLw6wajYscNIfXuGyPqepXykKc+uO+s0Znqfl3tzm9umXhJnG9xJE9f8w4JxKkMPacm4nDJ811XB4zFeqJcet9ciYDAnciyYxNENqWSYwwXfMALF5KM1XTy9nBTYW7IMG6rAM1kL2/yvPaF5gHYtx401t3ktLpDIH4ZDS+ojYvW7DdnIeWT17FhCxU0UJKkJAZJtGjh09cWRcuFsU1RlEAl9AIcAAglIsSbNnB84ANd2gFgkDe93IZ9DbDzaPculdJGnxkpHI+TkYLvWkJEIKfHYz3Uam+9wy7YIOCgLu0xwTYl+5D5Rcf3UZp4NX/AGv223wxRVwxtRvnc52nrfWc95Aw7lfsPTKGtYLZxDdUReA6DlEQ2ns6z133sRSY22Vqmb7Lkq2x5A6jMCDxPVE61dIXGT1duFLqSEsPICsgHLOA9tJv6gYsSwdjzvaL/wBK8qZ7svkztKb7oGwrchTjqS4uce9VbNLwqNQrWk0CbB3HOovK56Xhu03uy4JK5EpqoMwjAiOdp6mO6tnrzE3InuM+Yvm4a47ibz2hvBhpHXPMKB8jZ7Gzmwwug1NWcQmUK0OT1XsmabHwi9ltfGSZ3U8g5AGC8jWMnXSxeC7gh6UaAi25bADm2j59ydtmGwdIdhpxLECwOIL2cayIjOGo6dWixxOvXfZHrDSvLrltyf3S0MRcbxyLBo1Dtb8h+PsD5C7JJAR8qRPP9hbViENOaA1xiTtkLSkQ8RJsTGzp2ozf2hjbMTDQDW80OmC2u5c5Gc49N6/1hyPw1JujR883/o+GEXhLVQzYkVlcshcmdkR0XArbEgMcPqy8GIZyg6GTLpkWYtTsavavbDdZdPOzMV6LXztF7YY2sDnA+uGcL7Pbu14NF6aV47bU5I7v4PONgRSfboL8lnZ7R0X2PrKTbWgEADGYztaRbaiOk7xNwH49QfVjaT6scGp3GJKGAIx0htJC7KTiFp7Ie6gHEHOGguVGkolB9oync/NOfEcYeVib2fEObOqI7wf/ANKcJp1zCNoRqGbG0JxhlTTWMvO4vBcIkU8z2Q5LFxj2MNNjnjwY0lYUKZ8Q4AYKLu2FrYjFn0PDODtgRcu1sduzQ8ejNK82+Xk9kWGij/LrRvNs9E4FHtaNpDqaM6lj/G/Z+p97TZ07eZw4SUkEv1nsWaz1ntA66jMEj4HS+xdbl33bjhECbXkBUeQFRFyX3XtiK7chSu1d78tuI2l1eN0UmMllHG/i/G93a8C7deyUilOmW09qTHhryhBa2j0PA4j3GZSUl9cAGYuzo4WfKNkXK7UEEsxGn/icEM4ZnJvofbAqA0HRqZjgXdm3tHsDSsaY2eOoeztH5S1NkHEab2CTYwzHnGRd4qLw7mykoPiq0TFF2pBfJEs+ZxteMjyCSqqIdYM2Wb5tqh8S5xyF2TpzciWxNja6Pbmie9d76zBzkZqQnH9aMcYZJ3IaKr4aob7QdSdePjUsEM3QZ/uZ7IyWGKya85wVVTct6gOCXFmfHTpw/rsi2lt/sbxi8NKoBx43VyNkXCyV7TfRoNyS5Gxc9yMEBIVHHIDQ8f2nJtabd2JD4rEwj+QPZOH1sJLto4NEj38oMyxcM1uk4kchkj9N6XfYhtGd7+2puzb2vta7pPcd8ON2gtc7VfiI1EtVTlHYGzdkd/pZpENlv9jwGaLr6xjw7X7ceRbaofa3mpnORk3LHYQpVmOxaWzC5DixIJfUQMACWJIALMfUWrnBgWPpAEesPjg+x49LqV4XyzlXsKYyrXWxtl8jOXfD7QGweLHHXZoGUaD4tw7aOm2OxNlu5MrsP/VLd+wOGPJ2KazDRZqvCOvfzad69jgQU+WMF3ijWzx+09GN77+nujYbuudq60wO6r1HxmP7hEbjdzQA4SmGwY+2NOM9eO9fhWbM42SUFDhsicTBko2AvEy2Yoc2auGuWeIoUGwvhjss5ABIcOEkkQCgQ+jjbXZyBpu0W4pXmxqWU8itfbd1Nq3YG/SG7l+RnHvYu1Gpme671oGZam2ZAlNbXVFwsTqOL6odmNRPsNlXsjG56blexUbR9pgrtVXJ+7WxmHhPP9xT/Xmy1N5zGKzqewzkPuvXCsghEDV1pE1gsJlywcI3BQ15K56WEMWzJPDDFM7OpgZUUuoo9kD7LLDscFJAJcEWwe4JIcW1gi7bHF4BQOsb21A6CdBEXGpSlVi0KUpSEKUpSEKUpSEKUpSEKUpSEKUpSEKUpSEKUpSEKUpSEKUpSEKUpSEKUpSEKUpSEKUpSEKwuMfBqPfQYn8g3rNKwuMfBqPfQYn8g3qdB3juVEaRuPemO8pSlREwpSlIQpSlIQpSlIQpSlIR0cn+DUh+gy35BxWaVhcn+DUh+gy35BxWaVOgbz3JhFMOXnH/AGXyEOcVhcTkEXA661jyahW691JFysnGyWQRbWwiQl4mAhKUfYLs3pR1sbOKPCmEgJhhzcGwfOUVnz5NuPceZNupRbjh/EWU6oiT55M93bBknIDI64c9U16obx90HFQW05TODsWMiNWapFyiCS14NbSAQlK9futXQuNHnGBe72RlsV1FSP0C0qwmKSAAWALsHDkPixB069AipQCSdJt3YPhh3x8/+0OpdclphrvTcCzQ4GbVB8a9E8ZdZ6wAb50LB9gvJedh0tDk+SyJjY+yNCbhkOo4tsiEBkYFD1oKAlJBkovnM3o0PIGo+zXAOP3Ul+QXHjZkUnmi9I9TQ4/A9e7EDTgICMxl1y13AZaSObyYhtGNx/ljIeL/ABt2xp0GNhEhsE1whkJ3KZQUGDAqkkjUbRINy/0f0qwnLAzbNu2NhhrxDhyQxMRmJd7vv4cGFsLXe7+CkJ6mjy+jm+9Nzw7s7jKe0zq7ndym5XYa3axjZ43YagLeevtkRMIyebQeETUVkj7N3MR6ZuGW09EmceZYv3zTY80UbICCGJZ9Sh3aei3PFMZDeMXHHLkLwWZcOdGae1juDa22teRR0mc2dMCk1nWxJXoLVsjHNi0m2Bh0io9rySKtWqT57k5eOVUmt/oYpTrljBrAAWwAVnC2BvpIJxvcwzE7eQB+AthsjyDddSf1OlCdgyEsy2LtzbGx4RpplL9UlOZXI7jzxplUq1Dr6KwZgOLjdCtWrcnFnne2kTVK7G1Vtk3kumkigOYDVshbbLuP3DbkprrWHN0g223BeO/I7mJvKR7mj8o1qxvyRhmgXrqKQmER9IXbakG08ntZdINC8HxJKRwaKssHxZZojg7SYpP3XqdSq9YpmJfDG9gxAY+i3ohw12Y2iQlILgNjht246TpjqI+zLjwANhIDCciPMRA1mbkCQxEKkdLtmSKJIwmHbrukBKZN7gs9wGIOXCLDFezVNdbBLFTKj/IPjHyN2nvmB7dgO/tHAojrIK2WgWpt2cYtgbpAxbZ91zCRTbzB7B+WvH1kRlywIgzAR1SUx2SZwRu1JPoc8EkpIacuL70qoUQXDPfQDjsIYciJIBsdmk6MOdcUH2jxO3TMJNJZbA+REQ1oY3TqeKai5K520USlbeVjIzgfaWmGjkXW6xN9MT7IVMZUKGk51nv+OsW2UXUIxU64ji6pvDJDwz5DC9yRTYun+QOgA8N1TruO630Prvd/FPZO5ctKihsbaxyTF4oahXMrQ4J3Kpw2aJoGZeWgrqWMwVsooJOs467KMCPpXSrZ6hpGDfFThbZqAGwWFiREZo268Tv167774iPPDkh1MXiFyTQyNynjvxibbWL7D1tPpxtx7xp1jI5lN+82YR2RygGcMEWaUkesp+HCOoiUULyYz2EMVURIIH2qKjF3brcOoIvubT070qdydhYvOocRhyrmPdqsiABs7Z3bMCIGyjddk0fAl8Gr4TZRoq0Qcs29s26iON07yrSozlWufRLp2YYcBwiWF7Y47eXjzndcG51s9pOy/JXfgnYWyTEDieuNbzDVGnraeC6xEQabCdoAJVhEpTsrdi8n2Q92QAASCUnHEmERIoOjoMEDgUXwSKvjE2aT0PsyK7Jlm7d77ZiG1tsySERvWLNxrLUpPSmugEEjBk3JGyLSGyLa275M9lJc7IHzk8fI7HcC1GjMOyBRiPdrlHBm1lKFaiGcNuA1YMLCwcBgdMGGP4nkxQjkHxj5G7T3zA9uwHf2jgUR1kFbLQLU27OMWwN0gYts+65hIpt5g9g/LXj6yIy5YEQZgI6pKY7JM4I3akn0OeCSUkNOXGSbg0ly02cyIxIVyh1JEddTzXg2CbTCKcWDEhldnD1mSE7Dkel5cryPFDdeO5YJKKJgx+zofv8AYQ8kxGvs8ZE1xJDCl06Uz1WwtYeiktxHtxgwvje5ufGMMj0ObQbXoSAQLNoFaRCHDojDVCzJc2xFoAQqIePqlB7UiDdGGzPBq0UftG5YO4IppqpJEh6q2LpKqHGvj5yY0dGd1iJZv7Rc/MbImk22dDSsd4vz/X4yF7B2AVImj68mCkuWuw3U8hqL9cdiHjQo7r020aM3qL2Zk1iCDoZeKlQFEAi18XAJsXxIfnaYMLHVYevZhoigWlOMPJ3UnG3bOlceU+t0Nhyp9tOQam3TAOML2Nq6ol21ZTK50RPmdebF5Abmj2y0gEtlSzkAHdP4qyuGYtxBu5lyouWz7vbHFnbEnnJif6j36B1ee2bqePaY3u6kum1djrS2MxlyfWESvWthu0dcMtY7OGpTKZNxx6QsNqwtPAoMyf66J9xccX14qVOepybOSSfRTd2xDNiARqNxcmGaGAuwsLm3tjz+nfEbdByFOePMH5CQOGcRi+rY1pwrrYrx8eSvc4aCjYmjCpMw1/u9nuyJRIE7lANvZVJ/NdD7KcAC7wk7ZXcMcxgoTO8k0QRlqkwg56fqL8cJboPLSmWjWsQBNVhZB33SFlp012RdRaQLrPYc9aRlvF3LDMKwUH4GU8lXbhZGrFUpnKsLW2DG18Lmwub7bmDDknDVu2YRR3UfF3bsTloLYG2t9RTbE01bqeQ6c0U+EaVIa8ERuPSNSOLkpPtQTnuGaudn7CKKQuIomzETLaei7piPJIBoVH3Jft1l3fEfQe9dCI7RY7b3TqXbY7YWxpVtMcnrnj9MNKvY/Kp6cfHJcg9dybkhvVA9H81l2SEcHoMABEMk2dXJmpHm9SuwuPShUouC18bDQXta172Z3L4mASAzPbadm2+AxhSlKrEwpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQrC4x8Go99BifyDes0rC4x8Go99BifyDep0HeO5URpG496Y7ylKVETClKUhClKUhClKUhClKUhHRyf4NSH6DLfkHFZpWFyf4NSH6DLfkHFZpU6BvPcmEKV05KRR8M+BCy50OKJygguJjI4kTZMX0iKtRj405GAmjpdJwXINg4wkWXZj03DlEYPfP1E8WrRdVPBm28dKvC0dANNwaudHZeMmJuJhW2wImuWlAbXjzAdsAvHRyRbJ4aGQYgomxmL8ai5axl5ng1NKsl8scLwx1c8g8IONfPJHGJRpXTsJCAKgWcqFnA5KLkBKB5hJGBNk8AvgTlpi/bGmZhuuoOciXDDPB6gRRcZs1WmWLlNbJHK2d+mgGxdfbYiIfYGrJ1DdlQORIquI/NoBJwkyiJ1ug4WZrrh5JHXxIMTRRdt12qqrJ6vgm4QWQzyxVSzxxc88DCMxpWNTCaQ7XsdJTCfSyNQeJB8UMy8omB0XGY6KwdOkWTbMkbNOmQxji4eOW7RDJy6Sss6XRbp3yVVwwyyPDPBTDFRPLHPDPHHPDPDK2WGeGVrZY5Y5Y3vbLHK17Xxyte9r2va9r9F6QjVSsCO7U1hF5tDtaSXY8Cjux9iIGXWv9fnZhHhM2nTWOJIuJC5h0UIEW52ToAUHLdYysEYPkxaThFR9khgrhllntPxwhClKUhClKUhClKUhClKUhClKUhClKUhClKUhClKUhClKUhClKUhClKUhClKUhClKUhClKUhClKUhClKUhClKUhClKUhClKUhClKUhClKUhClKUhClKUhClKUhCsLjHwaj30GJ/IN6zSsLjHwaj30GJ/IN6nQd47lRGkbj3pjvKUpURMKUpSEKUpSEKUpSEKUpSEdHJ/g1IfoMt+QcVmlYXJ/g1IfoMt+QcVmlToG89yYR569ULBACUa4/EJHKdUhmTXktqQKxjm2A8pwZzg5KZQPGBw8K2NrgWQ2fqXY41wnkfhsxiqrMMsUGYBNhqXgpI0oh8fkq3brk6QnG08w3DHWjTXaXN3XS3FgIH4pxvVs4GbSl6AuYZS6Gzvq32kuQ7A3JkdZx5dujAOP8BwwXIEco9ruZIOA2Dj7it2cboVvuWaAlU0OTRnbjrtxDdUVjkdLjh0alMxHxaRxYKnPmToMRemwoG0ldHxTAYRBqYSJkMeO3Ttm3VHuIFU6n7GhnGRzxS15yG5E6m14YMbVISw3ClNBlJxLxO4jEnOS6JlS+yNBz8SKBYPJYQxEPYcAi8tYot2OGcoc5puFHW0uaEAC5L3uwALvgCScLs92BDRkpBKidG+5IzWxw04asHMfPXzB1tLOQC3UsNwCOLA55qu/AaWKGQOqeLhXZOg9XSGUv9RGQMNBRJLqdHVTQEIbpDWhe0THvtFsSLYMPeptdmg0cXY6SQxw61cy2PzH4Abh4+abaybW8W5JyVxM9s6b4vpRaEARIXWm0ooayk+z4T1CTqYoFAcJmGbaPFGJXek4bMZL2Bi71v3UQTkEe+iiadSI42zNgGa5TvfsedwvXXHDWmqygScxh4pqMVxfmzPY0BMQkJLIHJ4g8kJuaDh5ydu51G5owkWbJqPRGDBKODC3GS6knqp9sRttyY8keWsu2UJlkOnEZkwyYad0cyASqJy4vMXh15BeLmjdEaz2IXmzw6YFTUxuGFbHLkAJMiPFPwuREg4dXE5GYxJdiMNBfRhio6QwTgXtGYp3YYg4/wDC2yz5uDHEXF28QOTLWSb21Xy710OOcp+Q3K3a3VKNk6T0HogDzE5GxyKqah1hJYXOJsllq7Dd0b0VGIDCYa1MoWlcrirUCDkBqMM7lmBV2DWb2Yhcu1LtTY+39fDZ3y11Fx/2R1ODb43bOsucHJzksMtrTbI/bTDV8gwLyblRJN/xyCEgS7laIqT2Bg57D8Vc3FxLSUrYLjVvcbj1wg4/cadg7t21AImze7V37siXbGnezJIChLnYNu/F4wIvYGLmYWJgZHbW4wgORfBIuYJGe0nii7lV86Wzxzway4iC4HyClfJmW7s3Xu/Z5+BW1aAW2jfTouP6515lK3kycReGAtM6e1G2dJPC67Kzk1O85tJ8mYYYgmcSyuSVI1M0MwewBBchyQkENcMM1wbF3N3aAlqYOQ7h8DZN8cSS51ghgcHj4uGvIHh9FU9ljg2oOpbSrTug8Y3ANpSqRccuGWtuTS7+Og0m5d3xK0lyRDDtpcmT0FfJYZ75n27gsAW38RsUC8ddTalkzZa+f0b9TV1fCzHDDkGw4PckdKwGX72nBjaUU2dpPVI28L08R2FHI/lEz7DhjPhEYfaSZLhRV3wHS87mOy2SzS6MpY7HkYQ03HsLWwzqW/HKFR2QR0fsHmXdtJZXsGYEO43O/l9rUQgT2RKjcvNtxUB0zuTWurBA1sSPO0WLQdBG/bDVNJQ6oaIqviDyZQnCPQzLhyL4JygXJtkcfmWuGuqiYuZSoq2lUniTVXBbFI9L4RnDC9iSyiaebgoEUCu1csOuvnbLNW6hc1Cgyc4ekHcAggYkg2JsPRskuXGmJShQIJbA4OGNrDUNtzaxYtFnY0xMi45HxkjO99MhHBBTE7Ju5bUJ3xmWjBBuUO9xWOajER3XfJrkO5bNTNqw7Y7Ub55IpYZXjPkcMemePu8BQ6RGIk+f6l2G2ayWPoR9ybCLKRMtbAgMQlQOTRxV2hf/AHJYGQBdhe//ANdktj/tqUI+BFxYADjANuo0CxwQNAh2qrt4/VbCxDJEePbqPiLh2QeqItG6Kebt+6cvHOWN1nThZfPNTLsHTVs+auWTxBJ0zeILNXbVwniqg5bOE8kl0Fks7XwUSWSzzTUTztfHPDLLHK17XvasAWIOov7dWEa6P6/jj648AoNPeTkA1zw741aznXNHby8y4mgd9nJtpsR1NIduKJCGLLXUSjOuYpfkqE07pxbWYdQmXXPunmv9n7azcOoni5mw5kq+Xf57tLefOWGRPTZ7kO35Z8bYDlDDLaf7Z4waj4qciDsLnI+UzZMfJ+WcCSB8j30f1041pH4XKTT7jHGTUeAyySS0fINgxgCxA5Nr/JcB+MzeGR+CsQe1hYqHE35CBmw/Jrk6G2LrdqUYsxhGKav20K3Cz2nrLXD0aOHDnOrIFMY7rZViwZNMopdu0bpp6TXAXjOfZR4aSD7duMAR5OKOxbDlFyjDi9gx+xwzI3I7dw0PuVix5A4ljEjkbqQuN5N9hu5LhIj7SQLkmRom2da56LOkYl/QDl3/AGm1YpLNxzCVDSdFs4kYAan0HSMYgHgpEZLbkZzu2C43/sTYMZMbqjzVpCH4PTQ7XLx2d0JoOSj58McRvVIXZiRZgIv3rgmDrZb+LXizq652PnphglLcPUmobjegtXQ7a8n3TFRB+PzeaRsbFpS1FT/YTPXZpkHRCsxRd5ptKVY6fvNxwqOhY+y2MnBU9gN4uxwiqUmxjiq4tWZKzUQSCP8AhSMALhIBw2ixi4DD1nSTjv506YUpSqxMKUpSEKUpSEKUpSEKUpSEKUpSEKUpSEKUpSEKUpSEKUpSEKUpSEKUpSEKUpSEKUpSEKUpSEKUpSEKUpSEKUpSEKUpSEKUpSEKUpSEKwuMfBqPfQYn8g3rNKwuMfBqPfQYn8g3qdB3juVEaRuPemO8pSlREwpSlIQpSlIQpSlIQpSlIR0kmte8bkFrWve9wha1rWt03ve7Bxa1rWt4b3vfxWrM66RRPBVPNJTG2aamGSamGVunHPDPG+OWOVvLbLG97Xt5r1wkHpEWji1UHujCKOOKbZyzcMcXmaOP+3DB6mSdsUrrJYWxxycpOVbur2urmihne+F5xDWsSblsW17vbDnu52RlFKxrvgd+i5/18Z9o6d8Dv0XP+vjPtHRjs4jxiH38Dzp79RjJaVjXfA79Fz/r4z7R074Hfouf9fGfaOjHZxHjB9/A86e/UYyWlY13wO/Rc/6+M+0dO+B36Ln/AF8Z9o6MdnEeMH38Dzp79RjJaVjXfA79Fz/r4z7R074Hfouf9fGfaOjHZxHjB9/A86e/UYyWlY13wO/Rc/6+M+0dO+B36Ln/AF8Z9o6MdnEeMH38Dzp79RjJaVjXfA79Fz/r4z7R074Hfouf9fGfaOjHZxHjB9/A86e/UYyWlY13wO/Rc/6+M+0dO+B36Ln/AF8Z9o6MdnEeMH38Dzp79RjJaVjXfA79Fz/r4z7R074Hfouf9fGfaOjHZxHjB9/A86e/UYyWlY13wO/Rc/6+M+0dO+B36Ln/AF8Z9o6MdnEeMH38Dzp79RjJaVjXfA79Fz/r4z7R074Hfouf9fGfaOjHZxHjB9/A86e/UYyWlY13wO/Rc/6+M+0dO+B36Ln/AF8Z9o6MdnEeMH38Dzp79RjJaVjXfA79Fz/r4z7R074Hfouf9fGfaOjHZxHjB9/A86e/UYyWlY13wO/Rc/6+M+0dO+B36Ln/AF8Z9o6MdnEeMH38Dzp79RjJaVjXfA79Fz/r4z7R074Hfouf9fGfaOjHZxHjB9/A86e/UYyWlY13wO/Rc/6+M+0dO+B36Ln/AF8Z9o6MdnEeMH38Dzp79RjJaVjXfA79Fz/r4z7R074Hfouf9fGfaOjHZxHjB9/A86e/UYyWlY13wO/Rc/6+M+0dO+B36Ln/AF8Z9o6MdnEeMH38Dzp79RjJaVjXfA79Fz/r4z7R074Hfouf9fGfaOjHZxHjB9/A86e/UYyWlY13wO/Rc/6+M+0dO+B36Ln/AF8Z9o6MdnEeMH38Dzp79RjJaVjXfA79Fz/r4z7R074Hfouf9fGfaOjHZxHjB9/A86e/UYyWlY13wO/Rc/6+M+0dO+B36Ln/AF8Z9o6MdnEeMH38Dzp79RjJaVjXfA79Fz/r4z7R074Hfouf9fGfaOjHZxHjB9/A86e/UYyWlY13wO/Rc/6+M+0dO+B36Ln/AF8Z9o6MdnEeMH38Dzp79RjJaVjXfA79Fz/r4z7R074Hfouf9fGfaOjHZxHjB9/A86e/UYyWlY13wO/Rc/6+M+0dO+B36Ln/AF8Z9o6MdnEeMH38Dzp79RjJaVjXfA79Fz/r4z7R074Hfouf9fGfaOjHZxHjB9/A86e/UYyWlY13wO/Rc/6+M+0dO+B36Ln/AF8Z9o6MdnEeMH38Dzp79RjJaVjXfA79Fz/r4z7R074Hfouf9fGfaOjHZxHjB9/A86e/UYyWsMjNr2jcfte17XsEE2va9ui9r2YN7Xte1/Da9r+O1ctd6RKI5NUx7oOitjkm5cvHDHJ5gjl/tzwZJjXb5KyyuF8scXKrlK7W97K4Ir52thbmpp4JJ4JJ42wTTwxTTwxt0Y4YYY2xxxxt5LY42ta1vNamAbaPY/q069EMS97Ai4bFte72xrpSlREwpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIQpSlIR/9k=)

## 贡献

欢迎提交问题和贡献代码！请通过 [GitHub issues](https://github.com/yourcompany/necor-logging-starter/issues) 报告问题，或者提交 Pull Request 来贡献代码。

## 许可证

Necor Logging Starter 使用 MIT 许可证 开源。

---

感谢使用 Necor Bot Starter。如果您有任何问题或建议，请随时联系我们。