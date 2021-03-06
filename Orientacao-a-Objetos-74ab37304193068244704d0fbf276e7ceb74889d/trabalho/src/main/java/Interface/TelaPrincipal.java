/*
 Álvaro Domingues de Freitas    Matrícula: 201876007
 Augusto Castilho Medeiros      Matrícula: 201876044
 Ian Couto de Paula		Matrícula: 201876002
 Matheus Henrique Rubio		Matrícula: 201876036
 */
package Interface;

import javax.swing.JOptionPane;
import Classes.Banco;
import Classes.BancoVendas;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import Classes.Produto;
import Classes.ProdutoVendido;
import Classes.Estoque;
import Classes.RegistroDeVendas;
import java.io.IOException;


public class TelaPrincipal extends javax.swing.JFrame {

    Estoque estoque;
    Produto produto;
    ProdutoVendido produtoVendido;
    RegistroDeVendas listaProdutosVendidos;
    Estoque aux;
    Banco banco;
    BancoVendas vendas;
    int i = 0;
    /**
     * Construtor da interface TelaPrincipal.
     */
    public TelaPrincipal() {
        initComponents();
        estoque = new Estoque();
        produto = new Produto();
        produtoVendido = new ProdutoVendido();
        listaProdutosVendidos = new RegistroDeVendas();
        aux = new Estoque();
        banco = new Banco(estoque);                

        try {
            estoque = banco.pegaArquivo();
        } catch (IOException ex) {
        }
        imprimeTabela(estoque, jTableEstoque);
        
        vendas = new BancoVendas(listaProdutosVendidos);
        try {
            listaProdutosVendidos = vendas.pegaArquivo();
        } catch (IOException ex) {
        }
        imprimeTabela(listaProdutosVendidos, jTableControleDeVendas);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jInternalFrame3 = new javax.swing.JInternalFrame();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableEstoque = new javax.swing.JTable();
        botaoRecuperaLixeira = new javax.swing.JButton();
        botaoLimpaLixeira = new javax.swing.JButton();
        botaoLimpaEstoque = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        precoTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        adicionarProtudobutton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        fornecedorTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        produtoTxt = new javax.swing.JTextField();
        quantidadeTxt = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buscaId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        buscaNome = new javax.swing.JTextField();
        buscarQuantidade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        buscarPreco = new javax.swing.JTextField();
        buscarFornecedor = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableEditarProduto = new javax.swing.JTable();
        botaoAdicionarEdicao = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        registraVenda = new javax.swing.JButton();
        buscaProdutoNomeTxt = new javax.swing.JTextField();
        descontoReaisTxt = new javax.swing.JTextField();
        descontoPorcentagemTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTableRegistraVenda = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        quantidadeVenda = new javax.swing.JComboBox();
        buscaProdutoIdTxt = new javax.swing.JTextField();
        jInternalFrame4 = new javax.swing.JInternalFrame();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableControleDeVendas = new javax.swing.JTable();
        botaoLimpaRegistroDeVendas = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controle de Estoque");
        setMinimumSize(new java.awt.Dimension(100, 100));

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jInternalFrame3.setVisible(true);

        jTableEstoque.setAutoCreateRowSorter(true);
        jTableEstoque.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTableEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome do Produto", "Fornecedor", "Quantidade", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableEstoque.setToolTipText("");
        jTableEstoque.setCellSelectionEnabled(true);
        jTableEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableEstoque.setDoubleBuffered(true);
        jTableEstoque.setFillsViewportHeight(true);
        jTableEstoque.setFocusCycleRoot(true);
        jTableEstoque.setFocusTraversalPolicyProvider(true);
        jTableEstoque.setGridColor(new java.awt.Color(0, 0, 0));
        jTableEstoque.setInheritsPopupMenu(true);
        jTableEstoque.setNextFocusableComponent(this);
        jTableEstoque.setOpaque(false);
        jTableEstoque.setSurrendersFocusOnKeystroke(true);
        jScrollPane3.setViewportView(jTableEstoque);
        jTableEstoque.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        botaoRecuperaLixeira.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botaoRecuperaLixeira.setText("RECUPERAR DA LIXEIRA");
        botaoRecuperaLixeira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRecuperaLixeiraActionPerformed(evt);
            }
        });

        botaoLimpaLixeira.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botaoLimpaLixeira.setText("LIMPAR LIXEIRA");
        botaoLimpaLixeira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimpaLixeiraActionPerformed(evt);
            }
        });

        botaoLimpaEstoque.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botaoLimpaEstoque.setText("LIMPAR ESTOQUE");
        botaoLimpaEstoque.setNextFocusableComponent(botaoLimpaEstoque);
        botaoLimpaEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimpaEstoqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(botaoLimpaEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoRecuperaLixeira, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoLimpaLixeira, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoRecuperaLixeira, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoLimpaEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoLimpaLixeira, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {botaoLimpaEstoque, botaoLimpaLixeira, botaoRecuperaLixeira});

        javax.swing.GroupLayout jInternalFrame3Layout = new javax.swing.GroupLayout(jInternalFrame3.getContentPane());
        jInternalFrame3.getContentPane().setLayout(jInternalFrame3Layout);
        jInternalFrame3Layout.setHorizontalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jInternalFrame3Layout.setVerticalGroup(
            jInternalFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Estoque", jInternalFrame3);

        jPanel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPanel2KeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Preço R$:");

        precoTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        precoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                precoTxtKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Quantidade:");

        adicionarProtudobutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        adicionarProtudobutton.setText("ADICIONAR PRODUTO");
        adicionarProtudobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicionarProtudobuttonActionPerformed(evt);
            }
        });
        adicionarProtudobutton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                adicionarProtudobuttonKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                adicionarProtudobuttonKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Fornecedor:");

        fornecedorTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        fornecedorTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fornecedorTxtActionPerformed(evt);
            }
        });
        fornecedorTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fornecedorTxtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fornecedorTxtKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Produto:");

        produtoTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        produtoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produtoTxtActionPerformed(evt);
            }
        });
        produtoTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                produtoTxtKeyPressed(evt);
            }
        });

        quantidadeTxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100", "101", "102", "103", "104", "105", "106", "107", "108", "109", "110", "111", "112", "113", "114", "115", "116", "117", "118", "119", "120", "121", "122", "123", "124", "125", "126", "127", "128", "129", "130", "131", "132", "133", "134", "135", "136", "137", "138", "139", "140", "141", "142", "143", "144", "145", "146", "147", "148", "149", "150", "151", "152", "153", "154", "155", "156", "157", "158", "159", "160", "161", "162", "163", "164", "165", "166", "167", "168", "169", "170", "171", "172", "173", "174", "175", "176", "177", "178", "179", "180", "181", "182", "183", "184", "185", "186", "187", "188", "189", "190", "191", "192", "193", "194", "195", "196", "197", "198", "199", "200", "201", "202", "203", "204", "205", "206", "207", "208", "209", "210", "211", "212", "213", "214", "215", "216", "217", "218", "219", "220", "221", "222", "223", "224", "225", "226", "227", "228", "229", "230", "231", "232", "233", "234", "235", "236", "237", "238", "239", "240", "241", "242", "243", "244", "245", "246", "247", "248", "249", "250", "251", "252", "253", "254", "255", "256", "257", "258", "259", "260", "261", "262", "263", "264", "265", "266", "267", "268", "269", "270", "271", "272", "273", "274", "275", "276", "277", "278", "279", "280", "281", "282", "283", "284", "285", "286", "287", "288", "289", "290", "291", "292", "293", "294", "295", "296", "297", "298", "299", "300", "301", "302", "303", "304", "305", "306", "307", "308", "309", "310", "311", "312", "313", "314", "315", "316", "317", "318", "319", "320", "321", "322", "323", "324", "325", "326", "327", "328", "329", "330", "331", "332", "333", "334", "335", "336", "337", "338", "339", "340", "341", "342", "343", "344", "345", "346", "347", "348", "349", "350", "351", "352", "353", "354", "355", "356", "357", "358", "359", "360", "361", "362", "363", "364", "365", "366", "367", "368", "369", "370", "371", "372", "373", "374", "375", "376", "377", "378", "379", "380", "381", "382", "383", "384", "385", "386", "387", "388", "389", "390", "391", "392", "393", "394", "395", "396", "397", "398", "399", "400", "401", "402", "403", "404", "405", "406", "407", "408", "409", "410", "411", "412", "413", "414", "415", "416", "417", "418", "419", "420", "421", "422", "423", "424", "425", "426", "427", "428", "429", "430", "431", "432", "433", "434", "435", "436", "437", "438", "439", "440", "441", "442", "443", "444", "445", "446", "447", "448", "449", "450", "451", "452", "453", "454", "455", "456", "457", "458", "459", "460", "461", "462", "463", "464", "465", "466", "467", "468", "469", "470", "471", "472", "473", "474", "475", "476", "477", "478", "479", "480", "481", "482", "483", "484", "485", "486", "487", "488", "489", "490", "491", "492", "493", "494", "495", "496", "497", "498", "499", "500", "501", "502", "503", "504", "505", "506", "507", "508", "509", "510", "511", "512", "513", "514", "515", "516", "517", "518", "519", "520", "521", "522", "523", "524", "525", "526", "527", "528", "529", "530", "531", "532", "533", "534", "535", "536", "537", "538", "539", "540", "541", "542", "543", "544", "545", "546", "547", "548", "549", "550", "551", "552", "553", "554", "555", "556", "557", "558", "559", "560", "561", "562", "563", "564", "565", "566", "567", "568", "569", "570", "571", "572", "573", "574", "575", "576", "577", "578", "579", "580", "581", "582", "583", "584", "585", "586", "587", "588", "589", "590", "591", "592", "593", "594", "595", "596", "597", "598", "599", "600", "601", "602", "603", "604", "605", "606", "607", "608", "609", "610", "611", "612", "613", "614", "615", "616", "617", "618", "619", "620", "621", "622", "623", "624", "625", "626", "627", "628", "629", "630", "631", "632", "633", "634", "635", "636", "637", "638", "639", "640", "641", "642", "643", "644", "645", "646", "647", "648", "649", "650", "651", "652", "653", "654", "655", "656", "657", "658", "659", "660", "661", "662", "663", "664", "665", "666", "667", "668", "669", "670", "671", "672", "673", "674", "675", "676", "677", "678", "679", "680", "681", "682", "683", "684", "685", "686", "687", "688", "689", "690", "691", "692", "693", "694", "695", "696", "697", "698", "699", "700", "701", "702", "703", "704", "705", "706", "707", "708", "709", "710", "711", "712", "713", "714", "715", "716", "717", "718", "719", "720", "721", "722", "723", "724", "725", "726", "727", "728", "729", "730", "731", "732", "733", "734", "735", "736", "737", "738", "739", "740", "741", "742", "743", "744", "745", "746", "747", "748", "749", "750", "751", "752", "753", "754", "755", "756", "757", "758", "759", "760", "761", "762", "763", "764", "765", "766", "767", "768", "769", "770", "771", "772", "773", "774", "775", "776", "777", "778", "779", "780", "781", "782", "783", "784", "785", "786", "787", "788", "789", "790", "791", "792", "793", "794", "795", "796", "797", "798", "799", "800", "801", "802", "803", "804", "805", "806", "807", "808", "809", "810", "811", "812", "813", "814", "815", "816", "817", "818", "819", "820", "821", "822", "823", "824", "825", "826", "827", "828", "829", "830", "831", "832", "833", "834", "835", "836", "837", "838", "839", "840", "841", "842", "843", "844", "845", "846", "847", "848", "849", "850", "851", "852", "853", "854", "855", "856", "857", "858", "859", "860", "861", "862", "863", "864", "865", "866", "867", "868", "869", "870", "871", "872", "873", "874", "875", "876", "877", "878", "879", "880", "881", "882", "883", "884", "885", "886", "887", "888", "889", "890", "891", "892", "893", "894", "895", "896", "897", "898", "899", "900", "901", "902", "903", "904", "905", "906", "907", "908", "909", "910", "911", "912", "913", "914", "915", "916", "917", "918", "919", "920", "921", "922", "923", "924", "925", "926", "927", "928", "929", "930", "931", "932", "933", "934", "935", "936", "937", "938", "939", "940", "941", "942", "943", "944", "945", "946", "947", "948", "949", "950", "951", "952", "953", "954", "955", "956", "957", "958", "959", "960", "961", "962", "963", "964", "965", "966", "967", "968", "969", "970", "971", "972", "973", "974", "975", "976", "977", "978", "979", "980", "981", "982", "983", "984", "985", "986", "987", "988", "989", "990", "991", "992", "993", "994", "995", "996", "997", "998", "999", "1000", " " }));
        quantidadeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantidadeTxtActionPerformed(evt);
            }
        });
        quantidadeTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                quantidadeTxtKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(adicionarProtudobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fornecedorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(produtoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(precoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(quantidadeTxt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(162, 162, 162))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {adicionarProtudobutton, produtoTxt});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fornecedorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(produtoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(quantidadeTxt)
                    .addComponent(precoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(adicionarProtudobutton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {adicionarProtudobutton, fornecedorTxt, precoTxt, produtoTxt});

        jTabbedPane1.addTab("Registrar Compra", jPanel2);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Buscar produto por Id:");

        buscaId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buscaId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscaIdKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscaIdKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Buscar produto por nome:");

        buscaNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buscaNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscaNomeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscaNomeKeyReleased(evt);
            }
        });

        buscarQuantidade.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buscarQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscarQuantidadeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarQuantidadeKeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Buscar produto por quantidade:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Buscar produto por preço:");

        buscarPreco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buscarPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarPrecoActionPerformed(evt);
            }
        });
        buscarPreco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscarPrecoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarPrecoKeyReleased(evt);
            }
        });

        buscarFornecedor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buscarFornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscarFornecedorKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarFornecedorKeyReleased(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Buscar produto por fornecedor:");

        jTableEditarProduto.setAutoCreateRowSorter(true);
        jTableEditarProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTableEditarProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome do Produto", "Fornecedor", "Quantidade", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableEditarProduto.setToolTipText("");
        jTableEditarProduto.setCellSelectionEnabled(true);
        jTableEditarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableEditarProduto.setDoubleBuffered(true);
        jTableEditarProduto.setFillsViewportHeight(true);
        jTableEditarProduto.setFocusCycleRoot(true);
        jTableEditarProduto.setFocusTraversalPolicyProvider(true);
        jTableEditarProduto.setGridColor(new java.awt.Color(0, 0, 0));
        jTableEditarProduto.setInheritsPopupMenu(true);
        jTableEditarProduto.setNextFocusableComponent(this);
        jTableEditarProduto.setOpaque(false);
        jTableEditarProduto.setSurrendersFocusOnKeystroke(true);
        jScrollPane5.setViewportView(jTableEditarProduto);
        jTableEditarProduto.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        botaoAdicionarEdicao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botaoAdicionarEdicao.setText("ADICIONAR EDIÇÃO");
        botaoAdicionarEdicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdicionarEdicaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(buscarQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                        .addComponent(buscarFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                        .addComponent(buscaNome, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buscaId, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buscarPreco, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botaoAdicionarEdicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botaoAdicionarEdicao, buscaId, buscaNome, buscarFornecedor, buscarPreco, buscarQuantidade});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel11, jLabel12, jLabel13, jLabel2});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscaId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscarQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscarPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoAdicionarEdicao)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {botaoAdicionarEdicao, buscaId, buscaNome, buscarFornecedor, buscarPreco, buscarQuantidade});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel11, jLabel12, jLabel13, jLabel2});

        jTabbedPane1.addTab("Editar Produto", jPanel1);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Produto:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Desconto R$:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Desconto %:");

        registraVenda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        registraVenda.setText("REGISTRAR VENDA");
        registraVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registraVendaActionPerformed(evt);
            }
        });
        registraVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                registraVendaKeyPressed(evt);
            }
        });

        buscaProdutoNomeTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buscaProdutoNomeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaProdutoNomeTxtActionPerformed(evt);
            }
        });
        buscaProdutoNomeTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscaProdutoNomeTxtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscaProdutoNomeTxtKeyReleased(evt);
            }
        });

        descontoReaisTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        descontoReaisTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descontoReaisTxtActionPerformed(evt);
            }
        });
        descontoReaisTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                descontoReaisTxtKeyPressed(evt);
            }
        });

        descontoPorcentagemTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        descontoPorcentagemTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descontoPorcentagemTxtActionPerformed(evt);
            }
        });
        descontoPorcentagemTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                descontoPorcentagemTxtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                descontoPorcentagemTxtKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Quantidade:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Id:");

        jTableRegistraVenda.setAutoCreateRowSorter(true);
        jTableRegistraVenda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTableRegistraVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome do Produto", "Fornecedor", "Quantidade", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableRegistraVenda.setToolTipText("");
        jTableRegistraVenda.setCellSelectionEnabled(true);
        jTableRegistraVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableRegistraVenda.setDoubleBuffered(true);
        jTableRegistraVenda.setFillsViewportHeight(true);
        jTableRegistraVenda.setFocusCycleRoot(true);
        jTableRegistraVenda.setFocusTraversalPolicyProvider(true);
        jTableRegistraVenda.setGridColor(new java.awt.Color(0, 0, 0));
        jTableRegistraVenda.setInheritsPopupMenu(true);
        jTableRegistraVenda.setNextFocusableComponent(this);
        jTableRegistraVenda.setOpaque(false);
        jTableRegistraVenda.setSurrendersFocusOnKeystroke(true);
        jScrollPane7.setViewportView(jTableRegistraVenda);
        jTableRegistraVenda.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(214, 217, 233));
        jTextField1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jTextField1.setText("*A venda acontece para o primeiro elemento da tabela");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        quantidadeVenda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100", "101", "102", "103", "104", "105", "106", "107", "108", "109", "110", "111", "112", "113", "114", "115", "116", "117", "118", "119", "120", "121", "122", "123", "124", "125", "126", "127", "128", "129", "130", "131", "132", "133", "134", "135", "136", "137", "138", "139", "140", "141", "142", "143", "144", "145", "146", "147", "148", "149", "150", "151", "152", "153", "154", "155", "156", "157", "158", "159", "160", "161", "162", "163", "164", "165", "166", "167", "168", "169", "170", "171", "172", "173", "174", "175", "176", "177", "178", "179", "180", "181", "182", "183", "184", "185", "186", "187", "188", "189", "190", "191", "192", "193", "194", "195", "196", "197", "198", "199", "200", "201", "202", "203", "204", "205", "206", "207", "208", "209", "210", "211", "212", "213", "214", "215", "216", "217", "218", "219", "220", "221", "222", "223", "224", "225", "226", "227", "228", "229", "230", "231", "232", "233", "234", "235", "236", "237", "238", "239", "240", "241", "242", "243", "244", "245", "246", "247", "248", "249", "250", "251", "252", "253", "254", "255", "256", "257", "258", "259", "260", "261", "262", "263", "264", "265", "266", "267", "268", "269", "270", "271", "272", "273", "274", "275", "276", "277", "278", "279", "280", "281", "282", "283", "284", "285", "286", "287", "288", "289", "290", "291", "292", "293", "294", "295", "296", "297", "298", "299", "300", "301", "302", "303", "304", "305", "306", "307", "308", "309", "310", "311", "312", "313", "314", "315", "316", "317", "318", "319", "320", "321", "322", "323", "324", "325", "326", "327", "328", "329", "330", "331", "332", "333", "334", "335", "336", "337", "338", "339", "340", "341", "342", "343", "344", "345", "346", "347", "348", "349", "350", "351", "352", "353", "354", "355", "356", "357", "358", "359", "360", "361", "362", "363", "364", "365", "366", "367", "368", "369", "370", "371", "372", "373", "374", "375", "376", "377", "378", "379", "380", "381", "382", "383", "384", "385", "386", "387", "388", "389", "390", "391", "392", "393", "394", "395", "396", "397", "398", "399", "400", "401", "402", "403", "404", "405", "406", "407", "408", "409", "410", "411", "412", "413", "414", "415", "416", "417", "418", "419", "420", "421", "422", "423", "424", "425", "426", "427", "428", "429", "430", "431", "432", "433", "434", "435", "436", "437", "438", "439", "440", "441", "442", "443", "444", "445", "446", "447", "448", "449", "450", "451", "452", "453", "454", "455", "456", "457", "458", "459", "460", "461", "462", "463", "464", "465", "466", "467", "468", "469", "470", "471", "472", "473", "474", "475", "476", "477", "478", "479", "480", "481", "482", "483", "484", "485", "486", "487", "488", "489", "490", "491", "492", "493", "494", "495", "496", "497", "498", "499", "500", "501", "502", "503", "504", "505", "506", "507", "508", "509", "510", "511", "512", "513", "514", "515", "516", "517", "518", "519", "520", "521", "522", "523", "524", "525", "526", "527", "528", "529", "530", "531", "532", "533", "534", "535", "536", "537", "538", "539", "540", "541", "542", "543", "544", "545", "546", "547", "548", "549", "550", "551", "552", "553", "554", "555", "556", "557", "558", "559", "560", "561", "562", "563", "564", "565", "566", "567", "568", "569", "570", "571", "572", "573", "574", "575", "576", "577", "578", "579", "580", "581", "582", "583", "584", "585", "586", "587", "588", "589", "590", "591", "592", "593", "594", "595", "596", "597", "598", "599", "600", "601", "602", "603", "604", "605", "606", "607", "608", "609", "610", "611", "612", "613", "614", "615", "616", "617", "618", "619", "620", "621", "622", "623", "624", "625", "626", "627", "628", "629", "630", "631", "632", "633", "634", "635", "636", "637", "638", "639", "640", "641", "642", "643", "644", "645", "646", "647", "648", "649", "650", "651", "652", "653", "654", "655", "656", "657", "658", "659", "660", "661", "662", "663", "664", "665", "666", "667", "668", "669", "670", "671", "672", "673", "674", "675", "676", "677", "678", "679", "680", "681", "682", "683", "684", "685", "686", "687", "688", "689", "690", "691", "692", "693", "694", "695", "696", "697", "698", "699", "700", "701", "702", "703", "704", "705", "706", "707", "708", "709", "710", "711", "712", "713", "714", "715", "716", "717", "718", "719", "720", "721", "722", "723", "724", "725", "726", "727", "728", "729", "730", "731", "732", "733", "734", "735", "736", "737", "738", "739", "740", "741", "742", "743", "744", "745", "746", "747", "748", "749", "750", "751", "752", "753", "754", "755", "756", "757", "758", "759", "760", "761", "762", "763", "764", "765", "766", "767", "768", "769", "770", "771", "772", "773", "774", "775", "776", "777", "778", "779", "780", "781", "782", "783", "784", "785", "786", "787", "788", "789", "790", "791", "792", "793", "794", "795", "796", "797", "798", "799", "800", "801", "802", "803", "804", "805", "806", "807", "808", "809", "810", "811", "812", "813", "814", "815", "816", "817", "818", "819", "820", "821", "822", "823", "824", "825", "826", "827", "828", "829", "830", "831", "832", "833", "834", "835", "836", "837", "838", "839", "840", "841", "842", "843", "844", "845", "846", "847", "848", "849", "850", "851", "852", "853", "854", "855", "856", "857", "858", "859", "860", "861", "862", "863", "864", "865", "866", "867", "868", "869", "870", "871", "872", "873", "874", "875", "876", "877", "878", "879", "880", "881", "882", "883", "884", "885", "886", "887", "888", "889", "890", "891", "892", "893", "894", "895", "896", "897", "898", "899", "900", "901", "902", "903", "904", "905", "906", "907", "908", "909", "910", "911", "912", "913", "914", "915", "916", "917", "918", "919", "920", "921", "922", "923", "924", "925", "926", "927", "928", "929", "930", "931", "932", "933", "934", "935", "936", "937", "938", "939", "940", "941", "942", "943", "944", "945", "946", "947", "948", "949", "950", "951", "952", "953", "954", "955", "956", "957", "958", "959", "960", "961", "962", "963", "964", "965", "966", "967", "968", "969", "970", "971", "972", "973", "974", "975", "976", "977", "978", "979", "980", "981", "982", "983", "984", "985", "986", "987", "988", "989", "990", "991", "992", "993", "994", "995", "996", "997", "998", "999", "1000", " " }));
        quantidadeVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                quantidadeVendaKeyPressed(evt);
            }
        });

        buscaProdutoIdTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buscaProdutoIdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaProdutoIdTxtActionPerformed(evt);
            }
        });
        buscaProdutoIdTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscaProdutoIdTxtKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscaProdutoIdTxtKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscaProdutoIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel14)
                    .addComponent(jLabel8)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descontoReaisTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(descontoPorcentagemTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registraVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantidadeVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscaProdutoNomeTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {buscaProdutoIdTxt, buscaProdutoNomeTxt, jTextField1, quantidadeVenda, registraVenda});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(buscaProdutoNomeTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(buscaProdutoIdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(quantidadeVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(descontoPorcentagemTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descontoReaisTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(registraVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {buscaProdutoIdTxt, buscaProdutoNomeTxt, descontoPorcentagemTxt, descontoReaisTxt, jTextField1, quantidadeVenda, registraVenda});

        jTabbedPane1.addTab("Registrar venda", jPanel3);

        jInternalFrame4.setVisible(true);

        jTableControleDeVendas.setAutoCreateRowSorter(true);
        jTableControleDeVendas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTableControleDeVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome do produto", "Fornecedor", "Quantidade vendida", "Preço", "Desconto %", "Desconto R$", "Valor final da Venda"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableControleDeVendas.setToolTipText("");
        jTableControleDeVendas.setCellSelectionEnabled(true);
        jTableControleDeVendas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTableControleDeVendas.setDoubleBuffered(true);
        jTableControleDeVendas.setFillsViewportHeight(true);
        jTableControleDeVendas.setFocusCycleRoot(true);
        jTableControleDeVendas.setFocusTraversalPolicyProvider(true);
        jTableControleDeVendas.setGridColor(new java.awt.Color(0, 0, 0));
        jTableControleDeVendas.setInheritsPopupMenu(true);
        jTableControleDeVendas.setNextFocusableComponent(this);
        jTableControleDeVendas.setOpaque(false);
        jTableControleDeVendas.setSurrendersFocusOnKeystroke(true);
        jScrollPane6.setViewportView(jTableControleDeVendas);
        jTableControleDeVendas.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        botaoLimpaRegistroDeVendas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botaoLimpaRegistroDeVendas.setText("LIMPAR REGISTRO DE VENDAS");
        botaoLimpaRegistroDeVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimpaRegistroDeVendasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 984, Short.MAX_VALUE)
                    .addComponent(botaoLimpaRegistroDeVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoLimpaRegistroDeVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jInternalFrame4Layout = new javax.swing.GroupLayout(jInternalFrame4.getContentPane());
        jInternalFrame4.getContentPane().setLayout(jInternalFrame4Layout);
        jInternalFrame4Layout.setHorizontalGroup(
            jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jInternalFrame4Layout.setVerticalGroup(
            jInternalFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Controle de Vendas", jInternalFrame4);

        jMenuBar1.setBorder(null);
        jMenuBar1.setOpaque(false);
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   /** 
     * Método que restaura para o estoque todos os produtos que foram excluídos e permaneceram na lixeira.
     */
    private void botaoRecuperaLixeiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRecuperaLixeiraActionPerformed
        int limpar;
        limpar = JOptionPane.showConfirmDialog(null, "Deseja recuperar todo o conteúdo da lixeira e substituir pelo estoque?", "Limpar", JOptionPane.OK_CANCEL_OPTION);
        if (limpar == JOptionPane.OK_OPTION) {
            limpaTabela(jTableEstoque);
            estoque.recuperaLixo();
            imprimeTabela(estoque, jTableEstoque);
            atualizaJson(estoque);
        }
    }//GEN-LAST:event_botaoRecuperaLixeiraActionPerformed
    
    
    /**
     * Método que adiciona o produto ao estoque. 
     * @throws Exception Tratamento de exceção para os seguintes casos: - Produto já cadastrado no sistema
     *                                                                  - Campo produto vazio
     *                                                                  - Campo fornecedor vazio
     *                                                                  - Campo preço vazio
     *                                                                  - Preço com formato inválido
    */
    private void adicionarProtudobuttonActionPerformed () throws Exception{
        //Tratamento de exceção
        for (int i = 0; i < (estoque.listaProdutos().size()); i++) {
            if (produtoTxt.getText().equals(estoque.getProduto(i).getNome())) {
                JOptionPane.showMessageDialog(null, "Produto já cadastrado em sistema, apenas altere a quantidade.");
                throw new Exception();
            }
        }
        if (produtoTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo Produto está vazio, preencha-o para prosseguir.");
            throw new Exception();
        } else if (fornecedorTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo fornecedor está vazio, preencha-o para prosseguir.");
            throw new Exception();
        } else if (precoTxt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "O campo preço está vazio, preencha-o para prosseguir.");
            throw new Exception();
        } else {
            for (int i = 0; i < precoTxt.getText().length(); i++) {
                if ((precoTxt.getText().charAt(i) < "0".charAt(0) || precoTxt.getText().charAt(i) > "9".charAt(0)) && precoTxt.getText().charAt(i) != ".".charAt(0)) {
                    JOptionPane.showMessageDialog(null, "O preço inserido possui formato inválido.\nExemplo de formato correto: 25.30");
                    throw new Exception();
                }
            }
            //Instancia um novo Produto com as informações digitadas.
            produto = new Produto(produtoTxt.getText(), quantidadeTxt.getSelectedIndex()+1,Float.parseFloat(precoTxt.getText()), fornecedorTxt.getText(), estoque.listaProdutos().size() + 1);
            estoque.adicionaProduto(produto);
            String nome = estoque.getProduto(estoque.listaProdutos().size() - 1).getNome();
            String fornecedor = estoque.getProduto(estoque.listaProdutos().size() - 1).getFornecedor();
            Integer quantidade = estoque.getProduto(estoque.listaProdutos().size() - 1).getQuantidade();
            Float preco = estoque.getProduto(estoque.listaProdutos().size() - 1).getValor();
            //Instancia um novo objeto linha com as informações do produto.
            Object[] row = {estoque.getProduto(estoque.listaProdutos().size() - 1).getId(), nome, fornecedor, quantidade, preco};
            DefaultTableModel model = (DefaultTableModel) jTableEstoque.getModel();
            //Adiciona produto à tabela estoque
            model.addRow(row);
            atualizaJson(estoque);
        }
        //Limpa os campos de entrada de texto da aba Registra Compra
        fornecedorTxt.setText("");
        produtoTxt.setText("");
        precoTxt.setText("");
    }    
    /** 
     * Método responsável por limpar todo o estoque.
     */
    private void botaoLimpaEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimpaEstoqueActionPerformed
        int limpar;
        limpar = JOptionPane.showConfirmDialog(null, "Deseja limpar todo o estoque?", "Limpar", JOptionPane.OK_CANCEL_OPTION);
        //Ok = 0, Cancel = 2
        if (limpar == JOptionPane.OK_OPTION) {
            estoque.limpaLixo();
            limpaTabela(jTableEstoque);
            estoque.limpaEstoque();
            atualizaJson(estoque);
        }
        
    }//GEN-LAST:event_botaoLimpaEstoqueActionPerformed
    
    /**
     * Método que limpa o lixo.
     */
    private void botaoLimpaLixeiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimpaLixeiraActionPerformed
        int limpar;
        limpar = JOptionPane.showConfirmDialog(null, "Deseja limpar todo o lixo?", "Limpar", JOptionPane.OK_CANCEL_OPTION);
        if (limpar == JOptionPane.OK_OPTION) {
            estoque.limpaLixo();
            atualizaJson(estoque);
        }
    }//GEN-LAST:event_botaoLimpaLixeiraActionPerformed

    private void descontoReaisTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descontoReaisTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descontoReaisTxtActionPerformed

    private void buscaProdutoNomeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaProdutoNomeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscaProdutoNomeTxtActionPerformed

    /** 
     * Método que registra a venda de um produto do estoque.
     */
    private void registraVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registraVendaActionPerformed
        try {
            registraVendaActionPerformed();
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_registraVendaActionPerformed
    
    /** 
     * Método que registra a venda de um produto do estoque e a registra na tabela registro de vendas.
     * @throws Exception
     */
    private void registraVendaActionPerformed()throws Exception{
        int  exception = 0;
        DefaultTableModel model = (DefaultTableModel) jTableControleDeVendas.getModel();
        if (JOptionPane.showConfirmDialog(null, "Deseja finalizar a venda?", "Venda", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
            //caso exista, variáveis recebem o texto digitado
            String nomeProduto = buscaProdutoNomeTxt.getText();
            Integer id = 0;
            if (!buscaProdutoIdTxt.getText().isEmpty()) {
                id = Integer.parseInt(buscaProdutoIdTxt.getText());
            }
            //tratamento de exceção para nome e id vazios
            if(nomeProduto.isEmpty() && id.toString().isEmpty()){
                JOptionPane.showMessageDialog(precoTxt, "Produto não encontrado. A venda não pode ser concluida.");
                throw new Exception();
            }
            Integer quantidadeVendida = quantidadeVenda.getSelectedIndex()+1;
            //verifica, para todo o estoque, se o produto procurado existe
            for (int i = 0; i <= estoque.listaProdutos().size(); i++) {
                //se encontrar e a quantidade em estoque for maior que a vendida, a venda é concluida
                if ((!nomeProduto.isEmpty() && estoque.getProduto(i).getNome().contains(nomeProduto) ||
                        id.toString().contains(estoque.getProduto(i).getId().toString()))) {
                    //tratamento de exceção para quantidade insuficiente em estoque
                    if (estoque.getProduto(i).getQuantidade() < quantidadeVendida) {
                        JOptionPane.showMessageDialog(precoTxt, "Quantidade em estoque insuficiente. A venda não pode ser concluida.");
                        throw new Exception();
                    }else{
                        //tratamento de exceção para formato inválido de desconto em reais
                        for (int j = 0; j < descontoPorcentagemTxt.getText().length(); j++) {
                            if(descontoPorcentagemTxt.getText().charAt(j) == ".".charAt(0)){
                                exception ++;
                            }
                            if ((descontoPorcentagemTxt.getText().charAt(j) < "0".charAt(0) || 
                                    descontoPorcentagemTxt.getText().charAt(j) > "9".charAt(0)) &&
                                    descontoPorcentagemTxt.getText().charAt(j) != ".".charAt(0) ||  
                                    exception > 1 ||
                                    descontoPorcentagemTxt.getText().charAt(0) == ".".charAt(0) ||
                                    descontoPorcentagemTxt.getText().charAt(descontoPorcentagemTxt.getText().length()-1) == ".".charAt(0)) {
                                JOptionPane.showMessageDialog(null, "O desconto inserido possui formato inválido.\nExemplo de formato correto: 25.30");
                                throw new Exception();
                             }else{
                            }
                        }
                        //tratamento de exceção para formato inválido de desconto em porcentagem
                        for (int j = 0; j < descontoReaisTxt.getText().length(); j++) {
                            if ((descontoReaisTxt.getText().charAt(j) < "0".charAt(0) ||
                                   descontoReaisTxt.getText().charAt(j) > "9".charAt(0)) &&
                                    descontoReaisTxt.getText().charAt(j) != ".".charAt(0) || 
                                    exception > 1 ||
                                    descontoReaisTxt.getText().charAt(0) == ".".charAt(0) ||
                                    descontoReaisTxt.getText().charAt(descontoReaisTxt.getText().length()-1) == ".".charAt(0)) {
                                JOptionPane.showMessageDialog(null, "O desconto inserido possui formato inválido.\nExemplo de formato correto: 25.30");
                                throw new Exception();
                             }else{
                            }
                        }
                    }
                    //atualiza a qauntidade em estoque e a tabela do estoque
                    estoque.listaProdutos().get(i).setQuantidade(estoque.listaProdutos().get(i).getQuantidade() - quantidadeVendida);
                    atualizaTabela(jTableEstoque, estoque);
                    limpaTabela(jTableRegistraVenda);
                    //cria produto vendido
                    produtoVendido = new ProdutoVendido();
                    produtoVendido.setNome(estoque.getProduto(i).getNome());
                    produtoVendido.setId(estoque.getProduto(i).getId());
                    produtoVendido.setQuantidade(quantidadeVendida);
                    produtoVendido.setFornecedor(estoque.getProduto(i).getFornecedor());
                    produtoVendido.setValor(estoque.getProduto(i).getValor());
                    if(!descontoPorcentagemTxt.getText().equals("")){
                        produtoVendido.setDescontoPorcentagem(Float.parseFloat(descontoPorcentagemTxt.getText()));
                        produtoVendido.setValorFinalVenda(quantidadeVendida*(produtoVendido.getValor()-produtoVendido.getDescontoReais()));
                    }else if (!descontoReaisTxt.getText().equals("")) {
                            produtoVendido.setDescontoReais(Float.parseFloat(descontoReaisTxt.getText()));
                            produtoVendido.setValorFinalVenda(quantidadeVendida * (produtoVendido.getValor() * (produtoVendido.getDescontoPorcentagem() / 100)));
                    }else{
                        produtoVendido.setValorFinalVenda(quantidadeVendida*produtoVendido.getValor());
                    }
                    
                    //adiciona produto criado na lista de produtos vendidos
                    listaProdutosVendidos.adicionaVenda(produtoVendido);
                    //cria objeto linha com as informações do produto vendido
                    Object[] row = {produtoVendido.getId(),
                        produtoVendido.getNome(),
                        produtoVendido.getFornecedor(),
                        produtoVendido.getQuantidade(),
                        produtoVendido.getValor(),
                        produtoVendido.getDescontoPorcentagem(),
                        produtoVendido.getDescontoReais(),
                        produtoVendido.getValorFinalVenda()};
                    model.addRow(row);
                    break;
                }
            }
            //Campos de busca voltam a ser vazios
            buscaProdutoNomeTxt.setText("");
            descontoPorcentagemTxt.setText("");
            descontoReaisTxt.setText("");
            atualizaJson(estoque);
            atualizaJsonVendas(listaProdutosVendidos);
        }
    }
    /**
     *Adiciona à tabela de busca de produtos todos os elementos encontrados pela busca.
     */
    private void imprimeBuscaEstoque(){
        limpaTabela(jTableEditarProduto);
        DefaultTableModel model = (DefaultTableModel) jTableEditarProduto.getModel();
        for (int i = 0; i < estoque.listaProdutos().size(); i++) {
            //verifica se algum input não e, caso não seja, busca no estoque algum correspondente. 
            if ((!buscarFornecedor.getText().isEmpty() && estoque.getProduto(i).getFornecedor().contains(buscarFornecedor.getText()))
                    || (!buscaId.getText().isEmpty() && estoque.getProduto(i).getId().toString().contains(buscaId.getText()))
                    || (!buscaId.getText().isEmpty() && estoque.getProduto(i).getId().toString().contains(buscaId.getText()))
                    || (!buscaNome.getText().isEmpty() && estoque.getProduto(i).getNome().contains(buscaNome.getText()))
                    || (!buscarQuantidade.getText().isEmpty() && estoque.getProduto(i).getQuantidade().toString().contains(buscarQuantidade.getText()))
                    || (!buscarPreco.getText().isEmpty() && estoque.getProduto(i).getValor().toString().contains(buscarPreco.getText())))
            {
                aux.adicionaProduto(estoque.getProduto(i));
                //cria objeto linha para adicionar à tabela de busca
                Object[] row = {aux.getProduto(aux.listaProdutos().size() - 1).getId(),
                    aux.getProduto(aux.listaProdutos().size() - 1).getNome(),
                    aux.getProduto(aux.listaProdutos().size() - 1).getFornecedor(),
                    aux.getProduto(aux.listaProdutos().size() - 1).getQuantidade(),
                    aux.getProduto(aux.listaProdutos().size() - 1).getValor()};
                model.addRow(row);
            }
        }
    }
    
    /** 
     * Método que, após realizada a edição do produto selecionado, o ao estoque.
     */
    private void botaoAdicionarEdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdicionarEdicaoActionPerformed
        //percorre a lista estoque e o os produtos da tabela de busca, adicionando ao estoque todas as posições da tabela de busca
        for (int j = 0; j < jTableEditarProduto.getRowCount(); j++) {
            for (int i = 0; i < estoque.listaProdutos().size(); i++) {
                if((estoque.getProduto(i).getId() == Integer.parseInt(jTableEditarProduto.getValueAt(j, 0).toString()))){
                    estoque.getProduto(i).setNome(jTableEditarProduto.getValueAt(j, 1).toString());
                    estoque.getProduto(i).setFornecedor(jTableEditarProduto.getValueAt(j, 2).toString());
                    estoque.getProduto(i).setQuantidade(Integer.parseInt(jTableEditarProduto.getValueAt(j, 3).toString()));
                    estoque.getProduto(i).setValor(Float.parseFloat(jTableEditarProduto.getValueAt(j, 4).toString()));
                    break;
                }
            }
        }
        atualizaTabela(jTableEstoque, estoque);
        limpaTabela(jTableEditarProduto);
        atualizaJson(estoque);
        //campos de entrada de texto voltam a ser vazios
        buscaNome.setText("");
        buscaId.setText("");
        buscarFornecedor.setText("");
        buscarPreco.setText("");
        buscarQuantidade.setText("");
    }//GEN-LAST:event_botaoAdicionarEdicaoActionPerformed

    private void jPanel2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel2KeyTyped

    }//GEN-LAST:event_jPanel2KeyTyped
    /**
     *Permite que o usuário faça a alteração usando a tecla enter.
     */
    private void jPanel2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel2KeyPressed
        if(java.awt.event.KeyEvent.getKeyText(java.awt.event.KeyEvent.VK_ENTER).equals(java.awt.event.KeyEvent.getKeyText(evt.getKeyCode()))){
            try {
                adicionarProtudobuttonActionPerformed();
            } catch (Exception ex) {
            }
        }
    }//GEN-LAST:event_jPanel2KeyPressed
    /**
     *Permite que o usuário faça a alteração usando a tecla enter.
     */
    private void quantidadeTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantidadeTxtKeyPressed
        if(java.awt.event.KeyEvent.getKeyText(java.awt.event.KeyEvent.VK_ENTER).equals(java.awt.event.KeyEvent.getKeyText(evt.getKeyCode()))){
            try {
                adicionarProtudobuttonActionPerformed();
            } catch (Exception ex) {
            }
        }
    }//GEN-LAST:event_quantidadeTxtKeyPressed
    /**
     *Permite que o usuário faça a alteração usando a tecla enter.
     */    
    private void produtoTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_produtoTxtKeyPressed
        if(java.awt.event.KeyEvent.getKeyText(java.awt.event.KeyEvent.VK_ENTER).equals(java.awt.event.KeyEvent.getKeyText(evt.getKeyCode()))){
            try {
                adicionarProtudobuttonActionPerformed();
            } catch (Exception ex) {
            }
        }
    }//GEN-LAST:event_produtoTxtKeyPressed

    private void produtoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produtoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_produtoTxtActionPerformed

    private void fornecedorTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fornecedorTxtKeyTyped

    }//GEN-LAST:event_fornecedorTxtKeyTyped
    /**
     *Permite que o usuário faça a alteração usando a tecla enter.
     */
    private void fornecedorTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fornecedorTxtKeyPressed
        if(java.awt.event.KeyEvent.getKeyText(java.awt.event.KeyEvent.VK_ENTER).equals(java.awt.event.KeyEvent.getKeyText(evt.getKeyCode()))){
            try {
                adicionarProtudobuttonActionPerformed();
            } catch (Exception ex) {
            }
        }
    }//GEN-LAST:event_fornecedorTxtKeyPressed

    private void fornecedorTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fornecedorTxtActionPerformed

    }//GEN-LAST:event_fornecedorTxtActionPerformed
    /**
     *Permite que o usuário faça a alteração usando a tecla enter.
     */
    private void precoTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precoTxtKeyPressed
        if(java.awt.event.KeyEvent.getKeyText(java.awt.event.KeyEvent.VK_ENTER).equals(java.awt.event.KeyEvent.getKeyText(evt.getKeyCode()))){
            try {
                adicionarProtudobuttonActionPerformed();
            } catch (Exception ex) {
            }
        }
    }//GEN-LAST:event_precoTxtKeyPressed

    private void adicionarProtudobuttonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adicionarProtudobuttonKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_adicionarProtudobuttonKeyTyped
    /**
     *Permite que o usuário faça a alteração usando a tecla enter.
     */
    private void adicionarProtudobuttonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adicionarProtudobuttonKeyPressed
        if(java.awt.event.KeyEvent.getKeyText(java.awt.event.KeyEvent.VK_ENTER).equals(java.awt.event.KeyEvent.getKeyText(evt.getKeyCode()))){
            try {
                adicionarProtudobuttonActionPerformed();
            } catch (Exception ex) {
            }
        }
    }//GEN-LAST:event_adicionarProtudobuttonKeyPressed

    /**Método que adiciona o produto ao estoque. 
    */
    private void adicionarProtudobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicionarProtudobuttonActionPerformed
        try {
            adicionarProtudobuttonActionPerformed();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_adicionarProtudobuttonActionPerformed
    /**
     *Permite que a busca no estoque seja feita no momento da digitação.
     */
    private void buscaNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscaNomeKeyPressed
        try {
            imprimeBuscaEstoque();
        } catch (Exception ex) {
        }           
    }//GEN-LAST:event_buscaNomeKeyPressed
    /**
     *Permite que a busca no estoque seja feita no momento da digitação.
     */
    private void buscaIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscaIdKeyPressed
        if(java.awt.event.KeyEvent.getKeyText(java.awt.event.KeyEvent.VK_ENTER).equals(java.awt.event.KeyEvent.getKeyText(evt.getKeyCode()))){
            try {
                imprimeBuscaEstoque();
            } catch (Exception ex) {
            }   
        }
    }//GEN-LAST:event_buscaIdKeyPressed
    /**
     *Permite que a busca no estoque seja feita no momento da digitação.
     */
    private void buscarQuantidadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarQuantidadeKeyPressed
        if(java.awt.event.KeyEvent.getKeyText(java.awt.event.KeyEvent.VK_ENTER).equals(java.awt.event.KeyEvent.getKeyText(evt.getKeyCode()))){
            try {
                imprimeBuscaEstoque();
            } catch (Exception ex) {
            }   
        }
    }//GEN-LAST:event_buscarQuantidadeKeyPressed
    /**
     *Permite que a busca no estoque seja feita no momento da digitação.
     */
    private void buscarPrecoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarPrecoKeyPressed
        if(java.awt.event.KeyEvent.getKeyText(java.awt.event.KeyEvent.VK_ENTER).equals(java.awt.event.KeyEvent.getKeyText(evt.getKeyCode()))){
            try {
                imprimeBuscaEstoque();
            } catch (Exception ex) {
            }   
        }
    }//GEN-LAST:event_buscarPrecoKeyPressed
    /**
     *Permite que a busca no estoque seja feita no momento da digitação.
     */
    private void buscarFornecedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarFornecedorKeyPressed
        if(java.awt.event.KeyEvent.getKeyText(java.awt.event.KeyEvent.VK_ENTER).equals(java.awt.event.KeyEvent.getKeyText(evt.getKeyCode()))){
            try {
                imprimeBuscaEstoque();
            } catch (Exception ex) {
            }   
        }
    }//GEN-LAST:event_buscarFornecedorKeyPressed
    /**
     * Método que realiza uma busca de produto no estoque e o adiciona na tabela de vendas
     */
    private void imprimeBuscaTabelaVendas(){
        aux.limpaEstoque();
        limpaTabela(jTableRegistraVenda);
        DefaultTableModel model = (DefaultTableModel) jTableRegistraVenda.getModel();
        for (int i = 0, k = 0; i < estoque.listaProdutos().size(); i++) {
            if (!buscaProdutoIdTxt.getText().isEmpty() && estoque.getProduto(i).getId().toString().equals(buscaProdutoIdTxt.getText())) {
                k++;
            }
            if (!buscaProdutoNomeTxt.getText().isEmpty() && estoque.getProduto(i).getNome().contains(buscaProdutoNomeTxt.getText())) {
                k++;
            }
            if (k > 0) {
                aux.adicionaProduto(estoque.getProduto(i));
                k = 0;
                Object[] row = {aux.getProduto(aux.listaProdutos().size() - 1).getId(), aux.getProduto(aux.listaProdutos().size() - 1).getNome(), aux.getProduto(aux.listaProdutos().size() - 1).getFornecedor(), aux.getProduto(aux.listaProdutos().size() - 1).getQuantidade(), aux.getProduto(aux.listaProdutos().size() - 1).getValor()};
                model.addRow(row);
            }
        }
    }
    /**
     *Permite que a busca no estoque seja feita no momento da digitação e que faça uma alteração usando a tecla enter.
     */    
    private void buscaProdutoNomeTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscaProdutoNomeTxtKeyPressed
        if(java.awt.event.KeyEvent.getKeyText(java.awt.event.KeyEvent.VK_ENTER).equals(java.awt.event.KeyEvent.getKeyText(evt.getKeyCode()))){
            try {
                registraVendaActionPerformed();
            } catch (Exception ex) {
            }   
        }else{
            imprimeBuscaTabelaVendas();
        }
        
    }//GEN-LAST:event_buscaProdutoNomeTxtKeyPressed
    /**
     *Permite que a busca no estoque seja feita no momento da digitação e que faça uma alteração usando a tecla enter.
     */     
    private void descontoReaisTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descontoReaisTxtKeyPressed
        if(java.awt.event.KeyEvent.getKeyText(java.awt.event.KeyEvent.VK_ENTER).equals(java.awt.event.KeyEvent.getKeyText(evt.getKeyCode()))){
            try {
                registraVendaActionPerformed();
            } catch (Exception ex) {
            }   
        }
    }//GEN-LAST:event_descontoReaisTxtKeyPressed
    /**
     *Permite que a busca no estoque seja feita no momento da digitação e que faça uma alteração usando a tecla enter.
     */ 
    private void descontoPorcentagemTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descontoPorcentagemTxtKeyPressed
        if(java.awt.event.KeyEvent.getKeyText(java.awt.event.KeyEvent.VK_ENTER).equals(java.awt.event.KeyEvent.getKeyText(evt.getKeyCode()))){
            try {
                registraVendaActionPerformed();
            } catch (Exception ex) {
            }   
        }
    }//GEN-LAST:event_descontoPorcentagemTxtKeyPressed
    /**
     *Permite que a busca no estoque seja feita no momento da digitação e que faça uma alteração usando a tecla enter.
     */ 
    private void registraVendaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_registraVendaKeyPressed
        if(java.awt.event.KeyEvent.getKeyText(java.awt.event.KeyEvent.VK_ENTER).equals(java.awt.event.KeyEvent.getKeyText(evt.getKeyCode()))){
            try {
                registraVendaActionPerformed();
            } catch (Exception ex) {
            }   
        }
    }//GEN-LAST:event_registraVendaKeyPressed
    /**
     *Permite que a busca no estoque seja feita no momento da digitação e que faça uma alteração usando a tecla enter.
     */ 
    private void buscaProdutoNomeTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscaProdutoNomeTxtKeyReleased
        if(java.awt.event.KeyEvent.getKeyText(java.awt.event.KeyEvent.VK_ENTER).equals(java.awt.event.KeyEvent.getKeyText(evt.getKeyCode()))){
            try {
                registraVendaActionPerformed();
            } catch (Exception ex) {
            }   
        }else{
            imprimeBuscaTabelaVendas();
        }
    }//GEN-LAST:event_buscaProdutoNomeTxtKeyReleased
    /**
     *Permite que a busca no estoque seja feita no momento da digitação e que faça uma alteração usando a tecla enter.
     */ 
    private void buscaNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscaNomeKeyReleased
        try {
            imprimeBuscaEstoque();
        } catch (Exception ex) {
        }   
    }//GEN-LAST:event_buscaNomeKeyReleased

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void quantidadeVendaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantidadeVendaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantidadeVendaKeyPressed

    private void buscaProdutoIdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaProdutoIdTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscaProdutoIdTxtActionPerformed
    /**
     *Permite que a busca no estoque seja feita no momento da digitação e que faça uma alteração usando a tecla enter.
     */ 
    private void buscaProdutoIdTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscaProdutoIdTxtKeyPressed
        if(java.awt.event.KeyEvent.getKeyText(java.awt.event.KeyEvent.VK_ENTER).equals(java.awt.event.KeyEvent.getKeyText(evt.getKeyCode()))){
            try {
                registraVendaActionPerformed();
            } catch (Exception ex) {
            }   
        }else{
            imprimeBuscaTabelaVendas();
        }
    }//GEN-LAST:event_buscaProdutoIdTxtKeyPressed
    /**
     *Permite que a busca no estoque seja feita no momento da digitação e que faça uma alteração usando a tecla enter.
     */ 
    private void buscaProdutoIdTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscaProdutoIdTxtKeyReleased
        if(java.awt.event.KeyEvent.getKeyText(java.awt.event.KeyEvent.VK_ENTER).equals(java.awt.event.KeyEvent.getKeyText(evt.getKeyCode()))){
            try {
                registraVendaActionPerformed();
            } catch (Exception ex) {
            }   
        }else{
            imprimeBuscaTabelaVendas();
        }
    }//GEN-LAST:event_buscaProdutoIdTxtKeyReleased
    /**
     *Permite que a busca no estoque seja feita no momento da digitação.
     */ 
    private void buscaIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscaIdKeyReleased
        try {
            imprimeBuscaEstoque();
        } catch (Exception ex) {
        } 
    }//GEN-LAST:event_buscaIdKeyReleased
    /**
     *Permite que a busca no estoque seja feita no momento da digitação.
     */ 
    private void buscarQuantidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarQuantidadeKeyReleased
        try {
            imprimeBuscaEstoque();
        } catch (Exception ex) {
        } 
    }//GEN-LAST:event_buscarQuantidadeKeyReleased

    private void buscarPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarPrecoActionPerformed
    /**
     *Permite que a busca no estoque seja feita no momento da digitação.
     */ 
    private void buscarPrecoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarPrecoKeyReleased
        try {
            imprimeBuscaEstoque();
        } catch (Exception ex) {
        } 
    }//GEN-LAST:event_buscarPrecoKeyReleased
    /**
     *Permite que a busca no estoque seja feita no momento da digitação.
     */ 
    private void buscarFornecedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarFornecedorKeyReleased
        try {
            imprimeBuscaEstoque();
        } catch (Exception ex) {
        } 
    }//GEN-LAST:event_buscarFornecedorKeyReleased

    private void botaoLimpaRegistroDeVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimpaRegistroDeVendasActionPerformed
        limpaTabela(jTableControleDeVendas);
        listaProdutosVendidos.limpaVendas();
        atualizaJsonVendas(listaProdutosVendidos);
    }//GEN-LAST:event_botaoLimpaRegistroDeVendasActionPerformed

    private void descontoPorcentagemTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descontoPorcentagemTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descontoPorcentagemTxtActionPerformed

    private void descontoPorcentagemTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descontoPorcentagemTxtKeyReleased

    }//GEN-LAST:event_descontoPorcentagemTxtKeyReleased

    private void quantidadeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantidadeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantidadeTxtActionPerformed

    /** Método que limpa uma tabela passada como parâmetro.
     * @param tabela Tabela que será limpa
     */
    public void limpaTabela(JTable tabela) {        
        for (DefaultTableModel model = (DefaultTableModel) tabela.getModel(); tabela.getRowCount() > 0; model.removeRow(tabela.getRowCount() - 1)){}
    }

    /** Método que imprime a tabela de acordo com os produtos disponíveis em estoque.
     * @param estoque Estoque que será impresso na tabela.
     * @param tabela Tabela que receberá os produtos do estoque.
     */
    private void imprimeTabela(Estoque estoque, JTable tabela) {
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();
        for(int i = 0;i < estoque.listaProdutos().size();i++){
            Object[] row = {estoque.getProduto(i).getId(), 
                estoque.getProduto(i).getNome(),
                estoque.getProduto(i).getFornecedor(),
                estoque.getProduto(i).getQuantidade(),
                estoque.getProduto(i).getValor()};
            model.addRow(row);
        }
    }
    
    /**
     * Método para imprimir uma tabela de acordo com o registro de vendas.
     * @param registroVendas Registro de vendas que será impresso na tabela
     * @param tabela Tabela que receberá todo o registro de vendas.
     */
    private void imprimeTabela(RegistroDeVendas registroVendas, JTable tabela) {
        DefaultTableModel model = (DefaultTableModel) tabela.getModel();

        for (int i=registroVendas.getListaVendas().size(); i>0; i--) {
            Object[] row = {registroVendas.getListaVendas().get(i-1).getId(),
                        registroVendas.getListaVendas().get(i-1).getNome(),
                        registroVendas.getListaVendas().get(i-1).getFornecedor(),
                        registroVendas.getListaVendas().get(i-1).getQuantidade(),
                        registroVendas.getListaVendas().get(i-1).getValor(),
                        registroVendas.getListaVendas().get(i-1).getDescontoPorcentagem(),
                        registroVendas.getListaVendas().get(i-1).getDescontoReais(),
                        registroVendas.getListaVendas().get(i-1).getValorFinalVenda()};
            model.addRow(row);
        }
    }
    
    /** Método que atualiza uma tabela após alguma alteração no estoque.
     * @param tabela Tabela que será atualizada.
     * @param estoque Estoque que irá ser adicionado na tabela.
     */
    private void atualizaTabela(JTable tabela, Estoque estoque) {
        limpaTabela(tabela);
        imprimeTabela(estoque, tabela);
    }
    
    /**
     * Método que atualiza uma tabela após alguma alteração no registro de vendas.
     * @param tabela Tabela que será atualizada.
     * @param vendas Registro de vendas que irá ser adicionado na tabela.
     */
    private void atualizaTabela(JTable tabela, RegistroDeVendas vendas) {
        limpaTabela(tabela);
        imprimeTabela(vendas, tabela);
    }

    /** Método que realiza a atualização do arquivo .Json
     * @param estoque     
     */
    public void atualizaJson(Estoque estoque) {
        Banco bancoAux = new Banco(estoque);
        try {
            bancoAux.escreveArquivo();
        } catch (IOException ex) {
        }
    }
    
    public void atualizaJsonVendas(RegistroDeVendas vendas){
        BancoVendas bancoAux = new BancoVendas(vendas);
        try {
            bancoAux.escreveArquivo();
        } catch (IOException ex) {
        }
    }

    /** Método principal do projeto
     * @param args
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                TelaPrincipal tela = new TelaPrincipal();
                tela.setExtendedState(MAXIMIZED_BOTH);
                tela.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicionarProtudobutton;
    private javax.swing.JButton botaoAdicionarEdicao;
    private javax.swing.JButton botaoLimpaEstoque;
    private javax.swing.JButton botaoLimpaLixeira;
    private javax.swing.JButton botaoLimpaRegistroDeVendas;
    private javax.swing.JButton botaoRecuperaLixeira;
    private javax.swing.JTextField buscaId;
    private javax.swing.JTextField buscaNome;
    private javax.swing.JTextField buscaProdutoIdTxt;
    private javax.swing.JTextField buscaProdutoNomeTxt;
    private javax.swing.JTextField buscarFornecedor;
    private javax.swing.JTextField buscarPreco;
    private javax.swing.JTextField buscarQuantidade;
    private javax.swing.JTextField descontoPorcentagemTxt;
    private javax.swing.JTextField descontoReaisTxt;
    private javax.swing.JTextField fornecedorTxt;
    private javax.swing.JInternalFrame jInternalFrame3;
    private javax.swing.JInternalFrame jInternalFrame4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableControleDeVendas;
    private javax.swing.JTable jTableEditarProduto;
    private javax.swing.JTable jTableEstoque;
    private javax.swing.JTable jTableRegistraVenda;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField precoTxt;
    private javax.swing.JTextField produtoTxt;
    private javax.swing.JComboBox<String> quantidadeTxt;
    private javax.swing.JComboBox quantidadeVenda;
    private javax.swing.JButton registraVenda;
    // End of variables declaration//GEN-END:variables
}
