package chapter_9;

public class MenuTestDriveCom {
    public static void main(String args[]) {
        MenuComponent pancakeHouseMenu = new MenuCom("PANCAKE HOUSE MENU", "BREAKFAST");
        MenuComponent dinerMenu = new MenuCom("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new MenuCom("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new MenuCom("DESSER MENU", "Dessert of course!");

        MenuComponent allMenus = new MenuCom("ALL MENUS", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItemCom(
                "Apple Pie",
                "Apple pie with a flakey crust, topped with vanilla icecream",
                true,
                1.59
        ));

        WaitressCom waitressCom = new WaitressCom(allMenus);

        waitressCom.printMenu();
    }
}
