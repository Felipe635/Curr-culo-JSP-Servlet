/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2024-04-13 17:56:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Currículo</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"resources/css/index.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"resources/css/responsiveness.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<header>\n");
      out.write("    <div class=\"header_initial\">\n");
      out.write("        <h1>Currículo</h1>\n");
      out.write("        <p id=\"title\"></p>\n");
      out.write("        <div class=\"header_initial_download\">\n");
      out.write("            <button onclick=\"gerarPDF()\"><i class=\"fa-solid fa-download\"></i> Baixar Currículo</button>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("<main>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h2 class=\"container_user\">Lauriano Carlos</h2>\n");
      out.write("\n");
      out.write("        <section class=\"main_about_me\">\n");
      out.write("            <h2>Sobre mim</h2>\n");
      out.write("            <div class=\"main_about_me_content\">\n");
      out.write("                <article>\n");
      out.write("                    <header>\n");
      out.write("                        <h3>Desenvolvedor Júnior</h3>\n");
      out.write("                        <p>Data de Nascimento: 16/03/2000</p>\n");
      out.write("                    </header>\n");
      out.write("                    <div class=\"main_about_content_social_media\">\n");
      out.write("                        <h3>Redes Sociais</h3>\n");
      out.write("                        <a href=\"https://www.linkedin.com/in/lauriano-carlos-6b6165240/\" target=\"_blank\"><i class=\"fa-brands fa-linkedin\"></i></a>\n");
      out.write("                        <a href=\"\"><i class=\"fa-brands fa-square-github\"></i></a>\n");
      out.write("                        <a href=\"\"><i class=\"fa-brands fa-square-facebook\"></i></a>\n");
      out.write("                        <a href=\"\"><i class=\"fa-brands fa-square-instagram\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <p>Estou em um processo de transição de carreira, cursando Análise e\n");
      out.write("                        Desenvolvimento de Sistemas. Nos últimos 8 meses, tenho trabalhado como desenvolvedor WordPress, onde adquiri experiência em desenvolvimento web. Além disso, tenho conhecimentos em Java, Php, CSS, JavaScript e MySQL.\n");
      out.write("                    </p>\n");
      out.write("                </article>\n");
      out.write("\n");
      out.write("                <div>\n");
      out.write("                    <img src=\"resources/images/lauriano.jpeg\" alt=\"Foto de Lauriano Carlos\" title=\"Foto de Lauriano Carlos\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <section class=\"main_experience\">\n");
      out.write("            <h2>Experiência</h2>\n");
      out.write("            <article>\n");
      out.write("                <header>\n");
      out.write("                    <h3>Desenvolvedor Frontend</h3>\n");
      out.write("                </header>\n");
      out.write("                <p>Wordpress</p>\n");
      out.write("                <p>Agosto 2022 – Atual</p>\n");
      out.write("            </article>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <section class=\"main_projects\">\n");
      out.write("            <h2>Projetos</h2>\n");
      out.write("\n");
      out.write("            <div class=\"main_projects_content\">\n");
      out.write("\n");
      out.write("                <article>\n");
      out.write("                    <header>\n");
      out.write("                        <h2>\n");
      out.write("                            <a href=\"https://jbmquality.com.br\" target=\"_blank\">\n");
      out.write("                                <img src=\"resources/images/projects/jbm-quality.PNG\" alt=\"Site JBMQUALITY\" title=\"Site JBMQUALITY\">\n");
      out.write("                                JBMQUALITY\n");
      out.write("                            </a>\n");
      out.write("                        </h2>\n");
      out.write("                    </header>\n");
      out.write("\n");
      out.write("                    <p>A página apresenta informações detalhadas sobre os serviços oferecidos, um formulário de contato para solicitações e dúvidas dos usuários, além de uma seção para exibição de comentários e avaliações de clientes.</p>\n");
      out.write("                </article>\n");
      out.write("\n");
      out.write("                <article>\n");
      out.write("                    <header>\n");
      out.write("                        <h2>\n");
      out.write("                            <a href=\"https://360cybertechnology.com.br\" target=\"_blank\">\n");
      out.write("                                <img src=\"resources/images/projects/360cyber.PNG\" alt=\"Site 360cybertechnology\" title=\"Site 360cybertechnology\">\n");
      out.write("                                360CYBERTECHNOLOGY\n");
      out.write("                            </a>\n");
      out.write("                        </h2>\n");
      out.write("                    </header>\n");
      out.write("\n");
      out.write("                    <p>A página apresentar informações detalhadas sobre os serviços oferecidos e uma seção de contato para solicitações e dúvidas dos usuários. • Tecnologias: Animação Lottie com JSON, WordPress.</p>\n");
      out.write("                </article>\n");
      out.write("\n");
      out.write("                <article>\n");
      out.write("                    <header>\n");
      out.write("                        <h2>\n");
      out.write("                            <a href=\"https://360cybertechnology.com.br\" target=\"_blank\">\n");
      out.write("                                <img src=\"resources/images/projects/driveon.PNG\" alt=\"Site 360cybertechnology\" title=\"Site 360cybertechnology\">\n");
      out.write("                                DRIVEON\n");
      out.write("                            </a>\n");
      out.write("                        </h2>\n");
      out.write("                    </header>\n");
      out.write("\n");
      out.write("                    <p>A página apresentar informações detalhadas sobre os serviços oferecidos e uma seção de contato para solicitações e dúvidas dos usuários. • Tecnologias: Animação Lottie com JSON, WordPress.</p>\n");
      out.write("                </article>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <section class=\"main_technologies\">\n");
      out.write("            <h2>Minhas Tecnologias</h2>\n");
      out.write("\n");
      out.write("            <div>\n");
      out.write("                <div class=\"main_technologies_content\">\n");
      out.write("                    <div class=\"main_technologies_content_item\">\n");
      out.write("                        <p><i class=\"fa-brands fa-php\"></i> PHP</p>\n");
      out.write("                        <p class=\"main_technologies_content_item_star\">\n");
      out.write("                            <i class=\"fa-solid fa-star\"></i>\n");
      out.write("                            <i class=\"fa-solid fa-star\"></i>\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"main_technologies_content_item\">\n");
      out.write("                        <p><i class=\"fa-brands fa-js\"></i> Javascript</p>\n");
      out.write("                        <p class=\"main_technologies_content_item_star\">\n");
      out.write("                            <i class=\"fa-solid fa-star\"></i>\n");
      out.write("                            <i class=\"fa-solid fa-star\"></i>\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"main_technologies_content_item\">\n");
      out.write("                        <p><i class=\"fa-brands fa-java\"></i> Java</p>\n");
      out.write("                        <p class=\"main_technologies_content_item_star\">\n");
      out.write("                            <i class=\"fa-solid fa-star\"></i>\n");
      out.write("                            <i class=\"fa-solid fa-star\"></i>\n");
      out.write("                            <i class=\"fa-solid fa-star\"></i>\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"main_technologies_content_item\">\n");
      out.write("                        <p><i class=\"fa-solid fa-database\"></i> MySql</p>\n");
      out.write("                        <p class=\"main_technologies_content_item_star\">\n");
      out.write("                            <i class=\"fa-solid fa-star\"></i>\n");
      out.write("                            <i class=\"fa-solid fa-star\"></i>\n");
      out.write("                            <i class=\"fa-solid fa-star\"></i>\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"main_technologies_content_item\">\n");
      out.write("                        <p><i class=\"fa-brands fa-github\"></i> Git / Github</p>\n");
      out.write("                        <p class=\"main_technologies_content_item_star\">\n");
      out.write("                            <i class=\"fa-solid fa-star\"></i>\n");
      out.write("                            <i class=\"fa-solid fa-star\"></i>\n");
      out.write("                            <i class=\"fa-solid fa-star\"></i>\n");
      out.write("                            <i class=\"fa-solid fa-star\"></i>\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"main_technologies_content_item\">\n");
      out.write("                        <p><i class=\"fa-brands fa-bootstrap\"></i> Bootstrap 5</p>\n");
      out.write("                        <p class=\"main_technologies_content_item_star\">\n");
      out.write("                            <i class=\"fa-solid fa-star\"></i>\n");
      out.write("                            <i class=\"fa-solid fa-star\"></i>\n");
      out.write("                            <i class=\"fa-solid fa-star\"></i>\n");
      out.write("                            <i class=\"fa-solid fa-star\"></i>\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"main_technologies_content_item\">\n");
      out.write("                        <p><i class=\"fa-brands fa-wordpress\"></i> WordPress</p>\n");
      out.write("                        <p class=\"main_technologies_content_item_star\">\n");
      out.write("                            <i class=\"fa-solid fa-star\"></i>\n");
      out.write("                            <i class=\"fa-solid fa-star\"></i>\n");
      out.write("                            <i class=\"fa-solid fa-star\"></i>\n");
      out.write("                            <i class=\"fa-solid fa-star\"></i>\n");
      out.write("                            <i class=\"fa-solid fa-star\"></i>\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"main_technologies_content_right\">\n");
      out.write("                    <p>Carregando...</p>\n");
      out.write("                    <i class=\"fa-brands fa-space-awesome\"></i>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <section class=\"main_education\">\n");
      out.write("            <h2>Formação Acadêmica</h2>\n");
      out.write("\n");
      out.write("            <div class=\"main_education_content\">\n");
      out.write("                <article>\n");
      out.write("                    <header>\n");
      out.write("                        <h2>Centro Universitário Senac</h2>\n");
      out.write("                    </header>\n");
      out.write("\n");
      out.write("                    <p>Análise e desenvolvimento de Sistemas</p>\n");
      out.write("                    <p>Agosto/2022 – Cursando</p>\n");
      out.write("                </article>\n");
      out.write("\n");
      out.write("                <article>\n");
      out.write("                    <header>\n");
      out.write("                        <h2>UpInside Treinamentos</h2>\n");
      out.write("                    </header>\n");
      out.write("\n");
      out.write("                    <p>Full Stack PHP Developer</p>\n");
      out.write("                    <p>Dezembro/2023 – Cursando</p>\n");
      out.write("                </article>\n");
      out.write("\n");
      out.write("                <article>\n");
      out.write("                    <header>\n");
      out.write("                        <h2>Udemy</h2>\n");
      out.write("                    </header>\n");
      out.write("\n");
      out.write("                    <p>Java Programação Orientada a Objetos</p>\n");
      out.write("                    <p> Nélio Alves - 40h</p>\n");
      out.write("                </article>\n");
      out.write("\n");
      out.write("                <article>\n");
      out.write("                    <header>\n");
      out.write("                        <h2>Plataforma Curso em Vídeo</h2>\n");
      out.write("                    </header>\n");
      out.write("\n");
      out.write("                    <p>Wordpress - 40h</p>\n");
      out.write("                    <p>Html5 e Css3 - 40h</p>\n");
      out.write("                </article>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("    </div>\n");
      out.write("</main>\n");
      out.write("\n");
      out.write("<footer>\n");
      out.write("    <p>&copy; 2024 LAURIANO CARLOS. Todos os direitos reservados.</p>\n");
      out.write("</footer>\n");
      out.write("<script src=\"https://kit.fontawesome.com/f6b0e6c728.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jspdf/1.5.3/jspdf.debug.js\" integrity=\"sha384-NaWTHo/8YCBYJ59830LTz/P4aQZK1sS0SneOgAvhsIl3zBu8r9RevNg5lHCHAuQ/\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"resources/js/index.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
