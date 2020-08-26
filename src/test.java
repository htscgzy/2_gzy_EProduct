import java.util.HashMap;
import java.util.LinkedList;

public class test {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        //添加电脑
        HashMap<String,Object> properties = new HashMap<>();
        properties.put("size","16英寸");
        properties.put("CPU","Inter Core");
        properties.put("type","游戏本");

        EProductSpec eProductSpec = new EProductSpec(properties);

        HashMap<String,Object> properties_2 = new HashMap<>();
        properties_2.put("size","15英寸");
        properties_2.put("CPU","Inter Core");
        properties_2.put("type","台式机");

        EProductSpec eProductSpec_2 = new EProductSpec(properties_2);



        inventory.addEProduct("001",5000,eProductSpec_2);
        inventory.addEProduct("002",5500,eProductSpec_2);
        inventory.addEProduct("003",6000,eProductSpec_2);
        inventory.addEProduct("004",5000,eProductSpec);
        inventory.addEProduct("005",5500,eProductSpec);
        inventory.addEProduct("006",6000,eProductSpec);

        System.out.println("测试仓库产品");
        for(EProduct e:inventory.getInventory())
            System.out.println(e.toString());


        System.out.println();
        System.out.println("测试单条件match功能：");
        //添加搜索条件
        HashMap<String,Object> searchoneproperty = new HashMap<>();
        searchoneproperty.put("size","15英寸");
        EProductSpec matchoneeProductSpec = new EProductSpec(searchoneproperty);
        System.out.println("测试条件："+matchoneeProductSpec.toString());

        //测试match结果
        LinkedList<EProduct> matchoneresult =  inventory.search(matchoneeProductSpec);

        if(matchoneresult.size()==0)
            System.out.println("没有找到符合条件的产品！！");
        else{
            System.out.println("成功找到如下产品：");
            for(EProduct e:matchoneresult)
                System.out.println(e.toString());
        }

        System.out.println();
        System.out.println("测试多条件match功能：");
        //添加搜索条件
        HashMap<String,Object> searchproperties = new HashMap<>();
        searchproperties.put("size","16英寸");
        searchproperties.put("CPU","Inter Core");
        EProductSpec matcheProductSpec = new EProductSpec(searchproperties);
        System.out.println("测试条件："+matcheProductSpec.toString());

        //测试match结果
        LinkedList<EProduct> matchresult =  inventory.search(matcheProductSpec);

        if(matchresult.size()==0)
            System.out.println("没有找到符合条件的产品！！");
        else{
            System.out.println("成功找到如下产品：");
            for(EProduct e:matchresult)
                System.out.println(e.toString());
        }




    }
}
