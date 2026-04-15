# Necor MOS Starter

Necor MOS Starter 是一个自定义的 Spring Boot Starter 项目，用于集成对象存储服务，统一各服务API。通过简单的配置，您可以方便地在 Spring Boot 应用中使用本都存储和OSS等功能。

## 功能特性

- 支持多对象存储服务配置
- 统一API调用方式

## 快速开始

### 引入依赖

在您的 `pom.xml` 文件中添加以下依赖：

```xml
<dependency>
	<groupId>com.necor.mos</groupId>
	<artifactId>necor-mos-starter</artifactId>
	<version>1.0.0</version>
</dependency> 
```

### 配置文件

在 `application.yml` 或 `application.properties` 中添加以下配置：

```yml
necor:
  mos:
    active: local
    client:
      local:
        endpoint: http://127.0.0.1:8080
        bucket: data/upload
      oss:
        region: cn-hongkong
        endpoint: http://oss-${necor.mos.client.oss.region}.aliyuncs.com
        accessKeyId: test
        accessKeySecret: test
        bucket: test
      s3:
        region: mx-central-1
        endpoint: http://${necor.mos.client.oss.region}.amazonaws.com
        accessKeyId: test
        accessKeySecret: test
        bucket: test   
```

### 使用方式

```java
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class MosTest {

    @Resource
    private MosClient mosClient;

    @Test
    public void upload() throws Exception {
        mosClient.upload("template/excel/LineAdjustmentTemplate.xlsx", new FileInputStream("D:\\LineAdjustmentTemplate-250617.xlsx"));
    }

    @Test
    public void get() throws Exception {
        InputStream in = mosClient.get("template/excel/LineAdjustmentTemplate.xlsx");
        OutputStream out = new FileOutputStream("D:\\test.xlsx");
        StreamUtils.copy(in, out);
    }

    @Test
    public void delete() throws Exception {
        mosClient.delete("test.txt");
    }

    @Test
    public void bukets() throws Exception {
        List<String> bukets = mosClient.getBuckets();
        System.out.println(bukets);
    }

    @Test
    public void getAccessibleUrl() throws Exception {
        String url = mosClient.getAccessibleUrl("test.txt");
        System.out.println(url);
    }
}
```

## 说明

计划完成本地存储、OSS、S3，<mark>目前OSS还不完善、S3暂不支持</mark>。会在后续的开发中完成各存储服务的支持。

## 贡献

欢迎提交问题和贡献代码！请通过 [GitHub issues](https://github.com/lx027688/necor-mos-starter/issues) 报告问题，或者提交 [Pull Request](https://github.com/lx027688/necor-mos-starter/pulls) 来贡献代码。

## 许可证

Necor Logging Starter 使用 [MIT](https://github.com/lx027688/necor-mos-starter/blob/master/LICENSE) 许可证 开源。

---

感谢使用 Necor MOS Starter。如果您有任何问题或建议，请随时联系我们。