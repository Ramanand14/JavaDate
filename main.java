import java.io.FileInputStream;  
import java.io.FileNotFoundException;  
import java.io.IOException;  
import static java.lang.System.exit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.*;  
import org.apache.poi.ss.usermodel.Sheet;  
import org.apache.poi.ss.usermodel.Workbook;  
import org.apache.poi.xssf.usermodel.XSSFWorkbook;  

/**
 *
 * @author Ramanand Mohare & Pranoti Pawar
 * 
 */

public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox4 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Select the date:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "Octomber", "November", "December" }));

        jLabel2.setText("Result:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Result");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2099", "2098", "2097", "2096", "2095", "2094", "2093", "2092", "2091", "2090", "2089", "2088", "2087", "2086", "2085", "2084", "2083", "2082", "2081", "2080", "2079", "2078", "2077", "2076", "2075", "2074", "2073", "2072", "2071", "2070", "2069", "2068", "2067", "2066", "2065", "2064", "2063", "2062", "2061", "2060", "2059", "2058", "2057", "2056", "2055", "2054", "2053", "2052", "2051", "2050", "2049", "2048", "2047", "2046", "2045", "2044", "2043", "2042", "2041", "2040", "2039", "2038", "2037", "2036", "2035", "2034", "2033", "2032", "2031", "2030", "2029", "2028", "2027", "2026", "2025", "2024", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910", "1909", "1908", "1907", "1906", "1905", "1904", "1903", "1902", "1901", "1900", "1899", "1898", "1897", "1896", "1895", "1894", "1893", "1892", "1891", "1890", "1889", "1888", "1887", "1886", "1885", "1884", "1883", "1882", "1881", "1880", "1879", "1878", "1877", "1876", "1875", "1874", "1873", "1872", "1871", "1870", "1869", "1868", "1867", "1866", "1865", "1864", "1863", "1862", "1861", "1860", "1859", "1858", "1857", "1856", "1855", "1854", "1853", "1852", "1851", "1850", "1849", "1848", "1847", "1846", "1845", "1844", "1843", "1842", "1841", "1840", "1839", "1838", "1837", "1836", "1835", "1834", "1833", "1832", "1831", "1830", "1829", "1828", "1827", "1826", "1825", "1824", "1823", "1822", "1821", "1820", "1819", "1818", "1817", "1816", "1815", "1814", "1813", "1812", "1811", "1810", "1809", "1808", "1807", "1806", "1805", "1804", "1803", "1802", "1801", "1800", "1799", "1798", "1797", "1796", "1795", "1794", "1793", "1792", "1791", "1790", "1789", "1788", "1787", "1786", "1785", "1784", "1783", "1782", "1781", "1780", "1779", "1778", "1777", "1776", "1775", "1774", "1773", "1772", "1771", "1770", "1769", "1768", "1767", "1766", "1765", "1764", "1763", "1762", "1761", "1760", "1759", "1758", "1757", "1756", "1755", "1754", "1753", "1752", "1751", "1750", "1749", "1748", "1747", "1746", "1745", "1744", "1743", "1742", "1741", "1740", "1739", "1738", "1737", "1736", "1735", "1734", "1733", "1732", "1731", "1730", "1729", "1728", "1727", "1726", "1725", "1724", "1723", "1722", "1721", "1720", "1719", "1718", "1717", "1716", "1715", "1714", "1713", "1712", "1711", "1710", "1709", "1708", "1707", "1706", "1705", "1704", "1703", "1702", "1701", "1700", "1699", "1698", "1697", "1696", "1695", "1694", "1693", "1692", "1691", "1690", "1689", "1688", "1687", "1686", "1685", "1684", "1683", "1682", "1681", "1680", "1679", "1678", "1677", "1676", "1675", "1674", "1673", "1672", "1671", "1670", "1669", "1668", "1667", "1666", "1665", "1664", "1663", "1662", "1661", "1660", "1659", "1658", "1657", "1656", "1655", "1654", "1653", "1652", "1651", "1650", "1649", "1648", "1647", "1646", "1645", "1644", "1643", "1642", "1641", "1640", "1639", "1638", "1637", "1636", "1635", "1634", "1633", "1632", "1631", "1630", "1629", "1628", "1627", "1626", "1625", "1624", "1623", "1622", "1621", "1620", "1619", "1618", "1617", "1616", "1615", "1614", "1613", "1612", "1611", "1610", "1609", "1608", "1607", "1606", "1605", "1604", "1603", "1602", "1601", "1600" }));
        jComboBox4.setSelectedIndex(78);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField1))
                        .addGap(64, 64, 64)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                    .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(510, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBox2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(269, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        //declare variables:
        int i, k, code1, code2;
        Double ans1 = 0.0, ans2 = 0.0;

        //get the date into string format:
        String dd = (String)jComboBox1.getSelectedItem();
        //convert string into int:
        int x = Integer.parseInt(dd);

        //get the month into string format:
        String mm = (String)jComboBox2.getSelectedItem();

        //get the year into string format:
        String yy = (String)jComboBox4.getSelectedItem();
        //convert string into int:
        int z = Integer.parseInt(yy);

        //get the last two digit of the year i.e. y3y4:
        int y = z%100;

        //add variable y and x to variable a
        int a = y + x;

        //get the quotient by dividing the year by 4:
        int b = y/4;

        //store the sum of a & b into variable c:
        int c = a + b;


        //take month_code.xlsx file:
        //initialize required variables:
        String value1 = null;
        Workbook wb1 = null;

        //assign position variable pos1 to 0:
        int pos1 = 0;

        try {  
            //reading data from a file in the form of bytes:
            FileInputStream fis = new FileInputStream("month_code.xlsx");  

            //constructs an XSSFWorkbook object, by buffering the whole stream into the memory:
            wb1 = new XSSFWorkbook(fis);  
        }  
        catch(FileNotFoundException e) {  
            e.printStackTrace();  
        }  
        catch(IOException e1) {  
            e1.printStackTrace();  
        }  

        //getting the XSSFSheet object at given index:
        Sheet sheet1 = wb1.getSheetAt(0);   

        //returns the logical row:
        Row row1 = sheet1.getRow(0); 

        for(i = 1, k = 0; i < sheet1.getLastRowNum()+2; i++){
            //fix the cell value to 0:
            Cell cell1 = row1.getCell(k);
            row1 = sheet1.getRow(i);

            //get the data stored at specified location:
            value1 = cell1.getStringCellValue();

            //check wheather the given month name is availble at the speicified location or not?
            //if yes stop the execution or else increment the pos1 variable by 1 and continue:
            if(value1.equals(mm)){
                break;
            }
            else{
                pos1++;
            }
        }
    
        //looking into 2nd column of month_code.xlsx file:
        row1 = sheet1.getRow(1); 
        
        row1 = sheet1.getRow(pos1);
        Cell cell1 = row1.getCell(1);

        //get the value of the block adjacent to obtained position (pos1):
        ans1 = cell1.getNumericCellValue();

        //convert the obtained double format into int:
        code1 = (int)Math.round(ans1);
        
        //end of month_code.xlsx file use:


        //take year_code.xlsx file:
        //initialize the required variables:
        Double value2 = 0.0;
        Workbook wb2 = null;

        //assign position variable pos2 to 0:
        int pos2 = 0;

        try {  
            //reading data from a file in the form of bytes: 
            FileInputStream fis = new FileInputStream("year_code.xlsx");  

            //constructs an XSSFWorkbook object, by buffering the whole stream into the memory:
            wb2 = new XSSFWorkbook(fis);  
        }  
        catch(FileNotFoundException e) {  
            e.printStackTrace();  
        }  
        catch(IOException e1) {  
            e1.printStackTrace();  
        }  

        //getting the XSSFSheet object at given index:
        Sheet sheet2 = wb2.getSheetAt(0);   

        //returns the logical row:
        Row row2 = sheet2.getRow(1); 

        for(i = 1, k = 0; i < sheet2.getLastRowNum()+2; i++){
            //fix the cell value to 0:
            row2 = sheet2.getRow(i);
            Cell cell2 = row2.getCell(k);
            
            //get the data stored at specified location:
            value2 = cell2.getNumericCellValue();

            //check wheather the given year is availble at the speicified location or not?
            //if yes stop the execution or else increment the pos2 variable by 1 and continue:
            if(value2 == z){
                break;
            }
            else{
                pos2++;
            }
        }

        //looking into 2nd column of year_code.xlsx file:
        Cell cell2 = row2.getCell(1);
        row2 = sheet2.getRow(pos2);  
        
        //get the value of the block adjacent to obtained position (pos2):
        ans2= cell2.getNumericCellValue();

        //convert the obtained double format into int:
        code2 = (int)Math.round(ans2);

        //end of year_code.xlsx file use:


        //add result code1, code2 and c to variable c1:
        int c1 = code1 + code2 + c;

        //get the remainder of the c1 after dividing it by 7:
        int r = c1%7;


        //take day_code.xlsx file:
        //initialize required variables:
        Double value3 = 0.0;
        Workbook wb3 = null;

        //assign position variable pos3 to 0:
        int pos3 = 0;

        try {  
            //reading data from a file in the form of bytes  
            FileInputStream fis = new FileInputStream("day_code.xlsx");  

            //constructs an XSSFWorkbook object, by buffering the whole stream into the memory  
            wb3 = new XSSFWorkbook(fis);  
        }  
        catch(FileNotFoundException e) {  
            e.printStackTrace();  
        }  
        catch(IOException e1) {  
            e1.printStackTrace();  
        }  

        //getting the XSSFSheet object at given index:
        Sheet sheet3 = wb3.getSheetAt(0);     

        //returns the logical row:
        Row row3 = sheet3.getRow(0); 

        for(i = 1, k = 0; i < sheet3.getLastRowNum()+2; i++){
            //fix the cell value to 0:
            row3 = sheet3.getRow(i);
            Cell cell3 = row3.getCell(k);
            
            //get the data stored at specified location:
            value3 = cell3.getNumericCellValue();

            //check wheather the given remainder is availble at the speicified location or not?
            //if yes stop the execution or else increment the pos3 variable by 1 and continue:
            if(value3 == r){
                break;
            }
            else{
                pos3++;
            }
        }

        //looking into 2nd column of day_code.xlsx file:
        Cell cell3 = row3.getCell(1);
        row3 = sheet3.getRow(pos3);

        //get the value of the block adjacent to obtained position (pos3):
        String result = cell3.getStringCellValue();

        //display the result into the jTextField:
        jTextField1.setText(result);
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        //Clear the input field and set to index 0:
        jTextField1.setText(" ");
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        jComboBox4.setSelectedIndex(78);
    }                                        

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
    }                                          

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        //exit from the page:
        exit(0);
    }                                        

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        //disable the textfield:
        jTextField1.setEnabled(false);
    }                                           

    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration                   
}
