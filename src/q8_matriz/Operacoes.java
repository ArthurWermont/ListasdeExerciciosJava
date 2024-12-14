package q8_matriz;

public class Operacoes {
    public static boolean comparacao(Matriz a, Matriz b) {
        int cont = 0;
        if (a.getRows() == b.getRows() && a.getColumns() == b.getColumns()) {
            for (int i = 0; i < a.getRows(); i++) {
                for (int j = 0; j < a.getColumns(); j++) {
                    if (a.get(i, j) != b.get(i, j)) {
                        System.out.println("A matriz é diferente na linha " + i + " e na coluna " + j);
                        cont++;
                    }
                }
            }
        } else {
            return false;
        }
        return cont == 0;
    }

    public static Matriz transpose(Matriz matriz) {
        int newRows = matriz.getColumns();
        int newCols = matriz.getRows();
        double[] result = new double[newRows * newCols];

        for (int i = 0; i < matriz.getRows(); i++) {
            for (int j = 0; j < matriz.getColumns(); j++) {
                result[j * newCols + i] = matriz.get(i, j);
            }
        }

        return new Matriz(newRows, newCols, result);
    }

    public static Matriz oposta(Matriz matriz) {
        int newRows = matriz.getRows();
        int newCols = matriz.getColumns();
        double[] result = new double[newRows * newCols];

        for (int i = 0; i < matriz.getRows(); i++) {
            for (int j = 0; j < matriz.getColumns(); j++) {
                result[j * newCols + i] = matriz.get(i, j) * -1;
            }
        }
        return new Matriz(newRows, newCols, result);
    }

    public static Matriz nula(Matriz matriz) {
        int newRows = matriz.getRows();
        int newCols = matriz.getColumns();
        double[] result = new double[newRows * newCols];

        for (int i = 0; i < matriz.getRows(); i++) {
            for (int j = 0; j < matriz.getColumns(); j++) {
                result[j * newCols + i] = matriz.get(i, j) * 0;
            }
        }
        return new Matriz(newRows, newCols, result);
    }

    public static boolean identidade(Matriz matriz) {
        if (matriz.getRows() != matriz.getRows() || matriz.getColumns() != matriz.getColumns()) {
            return false;
        }
        for (int i = 0; i < matriz.getRows(); i++) {
            for (int j = 0; j < matriz.getColumns(); j++) {
                if (i == j && matriz.get(i, j) != 1) {
                    return false;
                } else if (i != j && matriz.get(i, j) != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean diagonal(Matriz matriz) {
        if (matriz.getRows() != matriz.getRows() || matriz.getColumns() != matriz.getColumns()) {
            return false;
        }
        for (int i = 0; i < matriz.getRows(); i++) {
            for (int j = 0; j < matriz.getColumns(); j++) {
                if (i != j && matriz.get(i, j) != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean singular(Matriz matriz) {
        if (matriz.getRows() != matriz.getRows() || matriz.getColumns() != matriz.getColumns()) {
            return false;
        }
        if (!diagonal(matriz)) {
            return false;
        }

        for (int i = 0; i < matriz.getRows(); i++) {
            if (matriz.get(i, i) != matriz.get(0, 0)) {
                return false;
            }
        }
        return true;
    }

    public static boolean simetrica(Matriz matriz) {
        if (matriz.getRows() != matriz.getRows() || matriz.getColumns() != matriz.getColumns()) {
            return false;
        }

        for (int i = 0; i < matriz.getRows(); i++) {
            for (int j = 0; j < matriz.getColumns(); j++) {
                if (matriz.get(i, j) != matriz.get(j, i)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean antiSimetrica(Matriz matriz) {
        if (matriz.getRows() != matriz.getRows() || matriz.getColumns() != matriz.getColumns()) {
            return false;
        }

        for (int i = 0; i < matriz.getRows(); i++) {
            for (int j = 0; j < matriz.getColumns(); j++) {
                if (matriz.get(j, i) != -matriz.get(i, j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static Matriz sub(Matriz a, Matriz b) {
        double[] result = new double[a.getRows() * a.getColumns()];
        for (int i = 0; i < a.getRows(); i++) {
            for (int j = 0; j < a.getColumns(); j++) {
                result[i * a.getColumns() + j] = (a.get(i, j) - b.get(i, j));
            }
        }
        return new Matriz(a.getRows(), a.getColumns(), result);
    }

    public static Matriz mult(Matriz a, Matriz b) {
        if (a.getColumns() != b.getRows()) {
            System.out.println("O número de colunas é diferente de linhas.");
        }

        double[] result = new double[a.getRows() * b.getColumns()];

        for (int i = 0; i < a.getRows(); i++) {
            for (int j = 0; j < b.getColumns(); j++) {
                double sum = 0;
                for (int k = 0; k < a.getColumns(); k++) {
                    sum += a.get(i, k) * b.get(k, j);
                }
                result[i * b.getColumns() + j] = sum;
            }
        }
        return new Matriz(a.getRows(), b.getColumns(), result);
    }

    public static Matriz copia(Matriz matriz) {
        double[] result = new double[matriz.getRows() * matriz.getColumns()];
        for (int i = 0; i < matriz.getRows(); i++) {
            for (int j = 0; j < matriz.getColumns(); j++) {
                result[i * matriz.getColumns() + j] = matriz.get(i, j);
            }
        }
        return new Matriz(matriz.getRows(), matriz.getColumns(), result);
    }
}
