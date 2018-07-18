# kato_paternity
Определение родительского кода КАТО по коду КАТО

# Описание

Функция принимает числовой код КАТО (*val*) и набор всех известных КАТО (*codeSet*), и пытается подобрать наиболее подходящий родительский код КАТО. 

    int getParent(int val, Set<Integer> codeSet)

Функция возвращает *-1*, если не удалось подобрать родительский КАТО или он не существует.

# Пример использования

    System.out.println(KatoPaternity.getParent(632400405, new HashSet<>(Arrays.asList(632400400, 632400000)))); // вернет 632400400
    System.out.println(KatoPaternity.getParent(315055109, new HashSet<>(Arrays.asList(315055000, 315055100)))); // вернет 315055100
