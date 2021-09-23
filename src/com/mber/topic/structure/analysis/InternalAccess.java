package com.mber.topic.structure.analysis;

public class InternalAccess {
    int outLocalF = 1;
    static int outStaticF = 1;

    static int ls1 = NestedC.nestedStaticF;
    static int ls2 = NestedC.nestedStaticF;

    void outLocalM() {
        NestedC.nestedStaticM();
    }

    static void outStaticM() {
        NestedC.nestedStaticM();
    }

    class InnerC {
        int innerLocalF = 1;

        int l1 = outLocalF;
        int l2 = outStaticF;
        int l3 = NestedC.nestedStaticF;

        private void innerLocalM() {
            outLocalM();
            outStaticM();
            NestedC.nestedStaticM();
        }

    }

    static class NestedC {
        int nestedLocalF = 1;
        static int nestedStaticF = 1;

        /*int l1 = outLocalF;*/
        int l2 = outStaticF;
        /*static int sl1 = outLocalF;*/
        static int sl2 = outStaticF;

        private void nestedLocalM() {/*outLocalM();*/
            outStaticM();
        }

        private static void nestedStaticM() {/*outLocalM();*/
            outStaticM();
        }
    }

    public static void main(String[] args) {
        new InternalAccess() {

            int anonymLocalF = 1;

            int l1 = this.outLocalF;
            int l2 = InternalAccess.outStaticF;

            @Override
            void outLocalM() {
                super.outLocalM();
            }

            abstract class AbstractClassInner {}
            class ClassInner {}
        };
    }
}
