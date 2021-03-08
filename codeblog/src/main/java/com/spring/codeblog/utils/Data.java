package com.spring.codeblog.utils;

import com.spring.codeblog.model.Post;
import com.spring.codeblog.repository.IPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class Data {

    @Autowired
    IPostRepository iPostRepository;

    // @PostConstruct
    public void savePosts() {
        List<Post> posts = new ArrayList<>();
        Post post1 = new Post();
        post1.setAutor("Alef Vinicius");
        post1.setTitulo("Docker");
        post1.setData(LocalDate.now());
        post1.setTexto("De forma bem resumida, podemos dizer que o Docker é\n" +
                "uma plataforma aberta, criada com o objetivo de facilitar o\n" +
                "desenvolvimento, a implantação e a execução de aplicações\n" +
                "em ambientes isolados. Foi desenhada especialmente para\n" +
                "disponibilizar uma aplicação da forma mais rápida possível.");

        Post post2 = new Post();
        post2.setAutor("Alec Bryan");
        post2.setTitulo("Docker");
        post2.setData(LocalDate.now());
        post2.setTexto("Usando o Docker, você pode facilmente gerenciar a infra-\n" +
                "estrutura da aplicação, isso agilizará o processo de criação,\n" +
                "manutenção e modificação do seu serviço.");

        posts.add(post1);
        posts.add(post2);

        for(Post post: posts){
            Post savedPost = iPostRepository.save(post);
            System.out.println("id gerado na criação:" + String.format("%s",savedPost.getId()));
        }

    }

}
