# Sistema de Controle de Versão

## Configuração inicial para uso do GIT
- Configuração de nome de usuário e e-mail no Git
    - git config --global user.name "Name"
    - git config --global user.email "email"

- Criando Personal Access Token (PAT) no GitHub
    1. Acesse o github e va em configurações
    2. Developer settings
    3. Personal Acess Tokens
    4. Tokens (classic)
    5. Generate new token

- Salvar em cache as credenciais do PAT
    - git config --global credential.helper 'cache --timeout=3600'

## Qual a diferença entre GIT rebase e GIT merge
- Merge
    O merge atua juntando as branchs e com isto ele cria um commit adicional ao qual é possível estar acionando uma mensagem

- Rebase
    O rebare atua juntando as branchs e não cria um commit