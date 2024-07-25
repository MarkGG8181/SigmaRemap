package remapped;

public class class_5659 implements class_6924 {
   private static String[] field_28690;
   private static final float[] field_28695 = new float[]{
      64.0F,
      128.0F,
      256.0F,
      512.0F,
      1024.0F,
      2048.0F,
      4096.0F,
      8192.0F,
      16384.0F,
      32768.0F,
      65536.0F,
      131072.0F,
      262144.0F,
      524288.0F,
      1048580.0F,
      2097150.0F,
      4194300.0F,
      8388610.0F,
      1.67772E7F,
      3.35544E7F,
      6.71089E7F,
      1.34218E8F,
      2.68435E8F,
      5.36871E8F,
      1.07374E9F,
      2.14748E9F,
      4.29497E9F,
      8.58993E9F,
      1.71799E10F,
      3.43597E10F,
      6.87195E10F,
      1.37439E11F,
      2.74878E11F,
      5.49756E11F,
      1.09950999E12F,
      2.19902E12F,
      4.39805E12F,
      8.79609E12F,
      1.75922E13F,
      3.51844E13F,
      7.0368698E13F,
      1.40737E14F,
      2.81475E14F,
      5.6295E14F,
      1.1259E15F,
      2.2518E15F,
      4.5036E15F,
      9.0072E15F,
      1.80144E16F,
      3.60288E16F,
      7.20576E16F,
      1.44115E17F,
      2.8823E17F,
      5.76461E17F,
      1.15292E18F,
      2.30584E18F,
      4.61169E18F,
      9.22337E18F,
      1.84467E19F,
      3.68935E19F,
      7.3787E19F,
      1.47574E20F,
      2.95148E20F,
      5.90296E20F
   };
   private static final float[] field_28687 = new float[]{
      0.984615F,
      0.969697F,
      0.941176F,
      0.888889F,
      0.8F,
      0.666667F,
      0.5F,
      0.333333F,
      0.2F,
      0.111111F,
      0.0588235F,
      0.030303F,
      0.0153846F,
      0.00775194F,
      0.00389105F,
      0.00194932F,
      9.7561E-4F,
      4.88043E-4F,
      2.44081E-4F,
      1.22055E-4F,
      6.10314E-5F,
      3.05166E-5F,
      1.52586E-5F,
      7.62934E-6F,
      3.81468E-6F,
      1.90734E-6F,
      9.53673E-7F,
      4.76837E-7F,
      2.38419E-7F,
      1.19209E-7F,
      5.96046E-8F
   };
   private static final float[][] field_28691 = new float[][]{
      {0.0302959F, 0.111015F, 0.332468F, 0.663212F, 0.882759F, 0.962406F, 0.984615F, 0.990329F, 0.991768F, 0.992128F, 0.992218F, 0.992241F, 0.992246F},
      {0.0153809F, 0.0587695F, 0.199377F, 0.496124F, 0.790123F, 0.927536F, 0.969697F, 0.980843F, 0.98367F, 0.984379F, 0.984556F, 0.984601F, 0.984612F},
      {0.00775006F, 0.0302744F, 0.110727F, 0.329897F, 0.653061F, 0.864865F, 0.941176F, 0.962406F, 0.967864F, 0.969238F, 0.969582F, 0.969668F, 0.96969F},
      {0.0038901F, 0.0153698F, 0.0586081F, 0.197531F, 0.484848F, 0.761905F, 0.888889F, 0.927536F, 0.937729F, 0.940312F, 0.94096F, 0.941122F, 0.941163F},
      {0.00194884F, 0.00774443F, 0.0301887F, 0.109589F, 0.32F, 0.615385F, 0.8F, 0.864865F, 0.882759F, 0.887348F, 0.888503F, 0.888792F, 0.888865F},
      {9.75372E-4F, 0.00388727F, 0.0153257F, 0.057971F, 0.190476F, 0.444444F, 0.666667F, 0.761905F, 0.790123F, 0.797508F, 0.799375F, 0.799844F, 0.799961F},
      {4.87924E-4F, 0.00194742F, 0.00772201F, 0.0298507F, 0.105263F, 0.285714F, 0.5F, 0.615385F, 0.653061F, 0.663212F, 0.6658F, 0.66645F, 0.666612F},
      {2.44021E-4F, 9.74659E-4F, 0.00387597F, 0.0151515F, 0.0555556F, 0.166667F, 0.333333F, 0.444444F, 0.484848F, 0.496124F, 0.499025F, 0.499756F, 0.499939F},
      {1.22026E-4F, 4.87567E-4F, 0.00194175F, 0.00763359F, 0.0285714F, 0.0909091F, 0.2F, 0.285714F, 0.32F, 0.329897F, 0.332468F, 0.333116F, 0.333279F},
      {6.10165E-5F, 2.43843E-4F, 9.71817E-4F, 0.00383142F, 0.0144928F, 0.047619F, 0.111111F, 0.166667F, 0.190476F, 0.197531F, 0.199377F, 0.199844F, 0.199961F},
      {
            3.05092E-5F,
            1.21936E-4F,
            4.86145E-4F,
            0.00191939F,
            0.00729927F,
            0.0243902F,
            0.0588235F,
            0.0909091F,
            0.105263F,
            0.109589F,
            0.110727F,
            0.111015F,
            0.111087F
      },
      {1.52548E-5F, 6.09719E-5F, 2.43132E-4F, 9.60615E-4F, 0.003663F, 0.0123457F, 0.030303F, 0.047619F, 0.0555556F, 0.057971F, 0.0586081F, 0.0587695F, 0.05881F},
      {
            7.62747E-6F,
            3.04869E-5F,
            1.21581E-4F,
            4.80538E-4F,
            0.00183486F,
            0.00621118F,
            0.0153846F,
            0.0243902F,
            0.0285714F,
            0.0298507F,
            0.0301887F,
            0.0302744F,
            0.0302959F
      },
      {
            3.81375E-6F,
            1.52437E-5F,
            6.0794E-5F,
            2.40327E-4F,
            9.18274E-4F,
            0.00311526F,
            0.00775194F,
            0.0123457F,
            0.0144928F,
            0.0151515F,
            0.0153257F,
            0.0153698F,
            0.0153809F
      },
      {
            1.90688E-6F,
            7.62189E-6F,
            3.03979E-5F,
            1.20178E-4F,
            4.59348E-4F,
            0.00156006F,
            0.00389105F,
            0.00621118F,
            0.00729927F,
            0.00763359F,
            0.00772201F,
            0.00774443F,
            0.00775006F
      },
      {
            9.53441E-7F,
            3.81096E-6F,
            1.51992E-5F,
            6.00925E-5F,
            2.29727E-4F,
            7.8064E-4F,
            0.00194932F,
            0.00311526F,
            0.003663F,
            0.00383142F,
            0.00387597F,
            0.00388727F,
            0.0038901F
      },
      {
            4.76721E-7F,
            1.90548E-6F,
            7.59965E-6F,
            3.00472E-5F,
            1.14877E-4F,
            3.90472E-4F,
            9.7561E-4F,
            0.00156006F,
            0.00183486F,
            0.00191939F,
            0.00194175F,
            0.00194742F,
            0.00194884F
      },
      {
            2.3836E-7F,
            9.52743E-7F,
            3.79984E-6F,
            1.50238E-5F,
            5.74416E-5F,
            1.95274E-4F,
            4.88043E-4F,
            7.8064E-4F,
            9.18274E-4F,
            9.60615E-4F,
            9.71817E-4F,
            9.74659E-4F,
            9.75372E-4F
      },
      {
            1.1918E-7F,
            4.76372E-7F,
            1.89992E-6F,
            7.51196E-6F,
            2.87216E-5F,
            9.76467E-5F,
            2.44081E-4F,
            3.90472E-4F,
            4.59348E-4F,
            4.80538E-4F,
            4.86145E-4F,
            4.87567E-4F,
            4.87924E-4F
      },
      {
            5.95901E-8F,
            2.38186E-7F,
            9.49963E-7F,
            3.756E-6F,
            1.4361E-5F,
            4.88257E-5F,
            1.22055E-4F,
            1.95274E-4F,
            2.29727E-4F,
            2.40327E-4F,
            2.43132E-4F,
            2.43843E-4F,
            2.44021E-4F
      },
      {
            2.9795E-8F,
            1.19093E-7F,
            4.74982E-7F,
            1.878E-6F,
            7.18056E-6F,
            2.44135E-5F,
            6.10314E-5F,
            9.76467E-5F,
            1.14877E-4F,
            1.20178E-4F,
            1.21581E-4F,
            1.21936E-4F,
            1.22026E-4F
      },
      {
            1.48975E-8F,
            5.95465E-8F,
            2.37491E-7F,
            9.39002E-7F,
            3.59029E-6F,
            1.22069E-5F,
            3.05166E-5F,
            4.88257E-5F,
            5.74416E-5F,
            6.00925E-5F,
            6.0794E-5F,
            6.09719E-5F,
            6.10165E-5F
      },
      {
            7.44876E-9F,
            2.97732E-8F,
            1.18745E-7F,
            4.69501E-7F,
            1.79515E-6F,
            6.10348E-6F,
            1.52586E-5F,
            2.44135E-5F,
            2.87216E-5F,
            3.00472E-5F,
            3.03979E-5F,
            3.04869E-5F,
            3.05092E-5F
      },
      {
            3.72438E-9F,
            1.48866E-8F,
            5.93727E-8F,
            2.34751E-7F,
            8.97575E-7F,
            3.05175E-6F,
            7.62934E-6F,
            1.22069E-5F,
            1.4361E-5F,
            1.50238E-5F,
            1.51992E-5F,
            1.52437E-5F,
            1.52548E-5F
      },
      {
            1.86219E-9F,
            7.44331E-9F,
            2.96864E-8F,
            1.17375E-7F,
            4.48788E-7F,
            1.52588E-6F,
            3.81468E-6F,
            6.10348E-6F,
            7.18056E-6F,
            7.51196E-6F,
            7.59965E-6F,
            7.62189E-6F,
            7.62747E-6F
      },
      {
            9.31095E-10F,
            3.72166E-9F,
            1.48432E-8F,
            5.86876E-8F,
            2.24394E-7F,
            7.62939E-7F,
            1.90734E-6F,
            3.05175E-6F,
            3.59029E-6F,
            3.756E-6F,
            3.79984E-6F,
            3.81096E-6F,
            3.81375E-6F
      },
      {
            4.65548E-10F,
            1.86083E-9F,
            7.42159E-9F,
            2.93438E-8F,
            1.12197E-7F,
            3.8147E-7F,
            9.53673E-7F,
            1.52588E-6F,
            1.79515E-6F,
            1.878E-6F,
            1.89992E-6F,
            1.90548E-6F,
            1.90688E-6F
      },
      {
            2.32774E-10F,
            9.30414E-10F,
            3.71079E-9F,
            1.46719E-8F,
            5.60985E-8F,
            1.90735E-7F,
            4.76837E-7F,
            7.62939E-7F,
            8.97575E-7F,
            9.39002E-7F,
            9.49963E-7F,
            9.52743E-7F,
            9.53441E-7F
      },
      {
            1.16387E-10F,
            4.65207E-10F,
            1.8554E-9F,
            7.33596E-9F,
            2.80492E-8F,
            9.53674E-8F,
            2.38419E-7F,
            3.8147E-7F,
            4.48788E-7F,
            4.69501E-7F,
            4.74982E-7F,
            4.76372E-7F,
            4.76721E-7F
      },
      {
            5.81935E-11F,
            2.32603E-10F,
            9.27699E-10F,
            3.66798E-9F,
            1.40246E-8F,
            4.76837E-8F,
            1.19209E-7F,
            1.90735E-7F,
            2.24394E-7F,
            2.34751E-7F,
            2.37491E-7F,
            2.38186E-7F,
            2.3836E-7F
      },
      {
            2.90967E-11F,
            1.16302E-10F,
            4.63849E-10F,
            1.83399E-9F,
            7.01231E-9F,
            2.38419E-8F,
            5.96046E-8F,
            9.53674E-8F,
            1.12197E-7F,
            1.17375E-7F,
            1.18745E-7F,
            1.19093E-7F,
            1.1918E-7F
      }
   };
   private static final float[][] field_28692 = new float[][]{
      {0.992246F, 0.992241F, 0.992218F, 0.992128F, 0.991768F, 0.990329F, 0.984615F, 0.962406F, 0.882759F, 0.663212F, 0.332468F, 0.111015F, 0.0302959F},
      {0.984612F, 0.984601F, 0.984556F, 0.984379F, 0.98367F, 0.980843F, 0.969697F, 0.927536F, 0.790123F, 0.496124F, 0.199377F, 0.0587695F, 0.0153809F},
      {0.96969F, 0.969668F, 0.969582F, 0.969238F, 0.967864F, 0.962406F, 0.941176F, 0.864865F, 0.653061F, 0.329897F, 0.110727F, 0.0302744F, 0.00775006F},
      {0.941163F, 0.941122F, 0.94096F, 0.940312F, 0.937729F, 0.927536F, 0.888889F, 0.761905F, 0.484848F, 0.197531F, 0.0586081F, 0.0153698F, 0.0038901F},
      {0.888865F, 0.888792F, 0.888503F, 0.887348F, 0.882759F, 0.864865F, 0.8F, 0.615385F, 0.32F, 0.109589F, 0.0301887F, 0.00774443F, 0.00194884F},
      {0.799961F, 0.799844F, 0.799375F, 0.797508F, 0.790123F, 0.761905F, 0.666667F, 0.444444F, 0.190476F, 0.057971F, 0.0153257F, 0.00388727F, 9.75372E-4F},
      {0.666612F, 0.66645F, 0.6658F, 0.663212F, 0.653061F, 0.615385F, 0.5F, 0.285714F, 0.105263F, 0.0298507F, 0.00772201F, 0.00194742F, 4.87924E-4F},
      {0.499939F, 0.499756F, 0.499025F, 0.496124F, 0.484848F, 0.444444F, 0.333333F, 0.166667F, 0.0555556F, 0.0151515F, 0.00387597F, 9.74659E-4F, 2.44021E-4F},
      {0.333279F, 0.333116F, 0.332468F, 0.329897F, 0.32F, 0.285714F, 0.2F, 0.0909091F, 0.0285714F, 0.00763359F, 0.00194175F, 4.87567E-4F, 1.22026E-4F},
      {0.199961F, 0.199844F, 0.199377F, 0.197531F, 0.190476F, 0.166667F, 0.111111F, 0.047619F, 0.0144928F, 0.00383142F, 9.71817E-4F, 2.43843E-4F, 6.10165E-5F},
      {
            0.111087F,
            0.111015F,
            0.110727F,
            0.109589F,
            0.105263F,
            0.0909091F,
            0.0588235F,
            0.0243902F,
            0.00729927F,
            0.00191939F,
            4.86145E-4F,
            1.21936E-4F,
            3.05092E-5F
      },
      {0.05881F, 0.0587695F, 0.0586081F, 0.057971F, 0.0555556F, 0.047619F, 0.030303F, 0.0123457F, 0.003663F, 9.60615E-4F, 2.43132E-4F, 6.09719E-5F, 1.52548E-5F},
      {
            0.0302959F,
            0.0302744F,
            0.0301887F,
            0.0298507F,
            0.0285714F,
            0.0243902F,
            0.0153846F,
            0.00621118F,
            0.00183486F,
            4.80538E-4F,
            1.21581E-4F,
            3.04869E-5F,
            7.62747E-6F
      },
      {
            0.0153809F,
            0.0153698F,
            0.0153257F,
            0.0151515F,
            0.0144928F,
            0.0123457F,
            0.00775194F,
            0.00311526F,
            9.18274E-4F,
            2.40327E-4F,
            6.0794E-5F,
            1.52437E-5F,
            3.81375E-6F
      },
      {
            0.00775006F,
            0.00774443F,
            0.00772201F,
            0.00763359F,
            0.00729927F,
            0.00621118F,
            0.00389105F,
            0.00156006F,
            4.59348E-4F,
            1.20178E-4F,
            3.03979E-5F,
            7.62189E-6F,
            1.90688E-6F
      },
      {
            0.0038901F,
            0.00388727F,
            0.00387597F,
            0.00383142F,
            0.003663F,
            0.00311526F,
            0.00194932F,
            7.8064E-4F,
            2.29727E-4F,
            6.00925E-5F,
            1.51992E-5F,
            3.81096E-6F,
            9.53441E-7F
      },
      {
            0.00194884F,
            0.00194742F,
            0.00194175F,
            0.00191939F,
            0.00183486F,
            0.00156006F,
            9.7561E-4F,
            3.90472E-4F,
            1.14877E-4F,
            3.00472E-5F,
            7.59965E-6F,
            1.90548E-6F,
            4.76721E-7F
      },
      {
            9.75372E-4F,
            9.74659E-4F,
            9.71817E-4F,
            9.60615E-4F,
            9.18274E-4F,
            7.8064E-4F,
            4.88043E-4F,
            1.95274E-4F,
            5.74416E-5F,
            1.50238E-5F,
            3.79984E-6F,
            9.52743E-7F,
            2.3836E-7F
      },
      {
            4.87924E-4F,
            4.87567E-4F,
            4.86145E-4F,
            4.80538E-4F,
            4.59348E-4F,
            3.90472E-4F,
            2.44081E-4F,
            9.76467E-5F,
            2.87216E-5F,
            7.51196E-6F,
            1.89992E-6F,
            4.76372E-7F,
            1.1918E-7F
      },
      {
            2.44021E-4F,
            2.43843E-4F,
            2.43132E-4F,
            2.40327E-4F,
            2.29727E-4F,
            1.95274E-4F,
            1.22055E-4F,
            4.88257E-5F,
            1.4361E-5F,
            3.756E-6F,
            9.49963E-7F,
            2.38186E-7F,
            5.95901E-8F
      },
      {
            1.22026E-4F,
            1.21936E-4F,
            1.21581E-4F,
            1.20178E-4F,
            1.14877E-4F,
            9.76467E-5F,
            6.10314E-5F,
            2.44135E-5F,
            7.18056E-6F,
            1.878E-6F,
            4.74982E-7F,
            1.19093E-7F,
            2.9795E-8F
      },
      {
            6.10165E-5F,
            6.09719E-5F,
            6.0794E-5F,
            6.00925E-5F,
            5.74416E-5F,
            4.88257E-5F,
            3.05166E-5F,
            1.22069E-5F,
            3.59029E-6F,
            9.39002E-7F,
            2.37491E-7F,
            5.95465E-8F,
            1.48975E-8F
      },
      {
            3.05092E-5F,
            3.04869E-5F,
            3.03979E-5F,
            3.00472E-5F,
            2.87216E-5F,
            2.44135E-5F,
            1.52586E-5F,
            6.10348E-6F,
            1.79515E-6F,
            4.69501E-7F,
            1.18745E-7F,
            2.97732E-8F,
            7.44876E-9F
      },
      {
            1.52548E-5F,
            1.52437E-5F,
            1.51992E-5F,
            1.50238E-5F,
            1.4361E-5F,
            1.22069E-5F,
            7.62934E-6F,
            3.05175E-6F,
            8.97575E-7F,
            2.34751E-7F,
            5.93727E-8F,
            1.48866E-8F,
            3.72438E-9F
      },
      {
            7.62747E-6F,
            7.62189E-6F,
            7.59965E-6F,
            7.51196E-6F,
            7.18056E-6F,
            6.10348E-6F,
            3.81468E-6F,
            1.52588E-6F,
            4.48788E-7F,
            1.17375E-7F,
            2.96864E-8F,
            7.44331E-9F,
            1.86219E-9F
      },
      {
            3.81375E-6F,
            3.81096E-6F,
            3.79984E-6F,
            3.756E-6F,
            3.59029E-6F,
            3.05175E-6F,
            1.90734E-6F,
            7.62939E-7F,
            2.24394E-7F,
            5.86876E-8F,
            1.48432E-8F,
            3.72166E-9F,
            9.31095E-10F
      },
      {
            1.90688E-6F,
            1.90548E-6F,
            1.89992E-6F,
            1.878E-6F,
            1.79515E-6F,
            1.52588E-6F,
            9.53673E-7F,
            3.8147E-7F,
            1.12197E-7F,
            2.93438E-8F,
            7.42159E-9F,
            1.86083E-9F,
            4.65548E-10F
      },
      {
            9.53441E-7F,
            9.52743E-7F,
            9.49963E-7F,
            9.39002E-7F,
            8.97575E-7F,
            7.62939E-7F,
            4.76837E-7F,
            1.90735E-7F,
            5.60985E-8F,
            1.46719E-8F,
            3.71079E-9F,
            9.30414E-10F,
            2.32774E-10F
      },
      {
            4.76721E-7F,
            4.76372E-7F,
            4.74982E-7F,
            4.69501E-7F,
            4.48788E-7F,
            3.8147E-7F,
            2.38419E-7F,
            9.53674E-8F,
            2.80492E-8F,
            7.33596E-9F,
            1.8554E-9F,
            4.65207E-10F,
            1.16387E-10F
      },
      {
            2.3836E-7F,
            2.38186E-7F,
            2.37491E-7F,
            2.34751E-7F,
            2.24394E-7F,
            1.90735E-7F,
            1.19209E-7F,
            4.76837E-8F,
            1.40246E-8F,
            3.66798E-9F,
            9.27699E-10F,
            2.32603E-10F,
            5.81935E-11F
      },
      {
            1.1918E-7F,
            1.19093E-7F,
            1.18745E-7F,
            1.17375E-7F,
            1.12197E-7F,
            9.53674E-8F,
            5.96046E-8F,
            2.38419E-8F,
            7.01231E-9F,
            1.83399E-9F,
            4.63849E-10F,
            1.16302E-10F,
            2.90967E-11F
      }
   };
   private static final float[] field_28694 = new float[]{
      0.0153846F,
      0.030303F,
      0.0588235F,
      0.111111F,
      0.2F,
      0.333333F,
      0.5F,
      0.666667F,
      0.8F,
      0.888889F,
      0.941176F,
      0.969697F,
      0.984615F,
      0.992248F,
      0.996109F,
      0.998051F,
      0.999024F,
      0.999512F,
      0.999756F,
      0.999878F,
      0.999939F,
      0.999969F,
      0.999985F,
      0.999992F,
      0.999996F,
      0.999998F,
      0.999999F,
      1.0F,
      1.0F,
      1.0F,
      1.0F
   };
   private static final float[][] field_28693 = new float[][]{
      {
            0.969704F,
            0.888985F,
            0.667532F,
            0.336788F,
            0.117241F,
            0.037594F,
            0.0153846F,
            0.00967118F,
            0.00823245F,
            0.00787211F,
            0.00778198F,
            0.00775945F,
            0.00775382F
      },
      {0.984619F, 0.94123F, 0.800623F, 0.503876F, 0.209877F, 0.0724638F, 0.030303F, 0.0191571F, 0.0163305F, 0.0156212F, 0.0154438F, 0.0153994F, 0.0153883F},
      {0.99225F, 0.969726F, 0.889273F, 0.670103F, 0.346939F, 0.135135F, 0.0588235F, 0.037594F, 0.0321361F, 0.0307619F, 0.0304178F, 0.0303317F, 0.0303102F},
      {0.99611F, 0.98463F, 0.941392F, 0.802469F, 0.515152F, 0.238095F, 0.111111F, 0.0724638F, 0.0622711F, 0.0596878F, 0.0590397F, 0.0588776F, 0.058837F},
      {0.998051F, 0.992256F, 0.969811F, 0.890411F, 0.68F, 0.384615F, 0.2F, 0.135135F, 0.117241F, 0.112652F, 0.111497F, 0.111208F, 0.111135F},
      {0.999025F, 0.996113F, 0.984674F, 0.942029F, 0.809524F, 0.555556F, 0.333333F, 0.238095F, 0.209877F, 0.202492F, 0.200625F, 0.200156F, 0.200039F},
      {0.999512F, 0.998053F, 0.992278F, 0.970149F, 0.894737F, 0.714286F, 0.5F, 0.384615F, 0.346939F, 0.336788F, 0.3342F, 0.33355F, 0.333388F},
      {0.999756F, 0.999025F, 0.996124F, 0.984848F, 0.944444F, 0.833333F, 0.666667F, 0.555556F, 0.515152F, 0.503876F, 0.500975F, 0.500244F, 0.500061F},
      {0.999878F, 0.999512F, 0.998058F, 0.992366F, 0.971429F, 0.909091F, 0.8F, 0.714286F, 0.68F, 0.670103F, 0.667532F, 0.666884F, 0.666721F},
      {0.999939F, 0.999756F, 0.999028F, 0.996169F, 0.985507F, 0.952381F, 0.888889F, 0.833333F, 0.809524F, 0.802469F, 0.800623F, 0.800156F, 0.800039F},
      {0.999969F, 0.999878F, 0.999514F, 0.998081F, 0.992701F, 0.97561F, 0.941176F, 0.909091F, 0.894737F, 0.890411F, 0.889273F, 0.888985F, 0.888913F},
      {0.999985F, 0.999939F, 0.999757F, 0.999039F, 0.996337F, 0.987654F, 0.969697F, 0.952381F, 0.944444F, 0.942029F, 0.941392F, 0.94123F, 0.94119F},
      {0.999992F, 0.99997F, 0.999878F, 0.999519F, 0.998165F, 0.993789F, 0.984615F, 0.97561F, 0.971429F, 0.970149F, 0.969811F, 0.969726F, 0.969704F},
      {0.999996F, 0.999985F, 0.999939F, 0.99976F, 0.999082F, 0.996885F, 0.992248F, 0.987654F, 0.985507F, 0.984848F, 0.984674F, 0.98463F, 0.984619F},
      {0.999998F, 0.999992F, 0.99997F, 0.99988F, 0.999541F, 0.99844F, 0.996109F, 0.993789F, 0.992701F, 0.992366F, 0.992278F, 0.992256F, 0.99225F},
      {0.999999F, 0.999996F, 0.999985F, 0.99994F, 0.99977F, 0.999219F, 0.998051F, 0.996885F, 0.996337F, 0.996169F, 0.996124F, 0.996113F, 0.99611F},
      {1.0F, 0.999998F, 0.999992F, 0.99997F, 0.999885F, 0.99961F, 0.999024F, 0.99844F, 0.998165F, 0.998081F, 0.998058F, 0.998053F, 0.998051F},
      {1.0F, 0.999999F, 0.999996F, 0.999985F, 0.999943F, 0.999805F, 0.999512F, 0.999219F, 0.999082F, 0.999039F, 0.999028F, 0.999025F, 0.999025F},
      {1.0F, 1.0F, 0.999998F, 0.999992F, 0.999971F, 0.999902F, 0.999756F, 0.99961F, 0.999541F, 0.999519F, 0.999514F, 0.999512F, 0.999512F},
      {1.0F, 1.0F, 0.999999F, 0.999996F, 0.999986F, 0.999951F, 0.999878F, 0.999805F, 0.99977F, 0.99976F, 0.999757F, 0.999756F, 0.999756F},
      {1.0F, 1.0F, 1.0F, 0.999998F, 0.999993F, 0.999976F, 0.999939F, 0.999902F, 0.999885F, 0.99988F, 0.999878F, 0.999878F, 0.999878F},
      {1.0F, 1.0F, 1.0F, 0.999999F, 0.999996F, 0.999988F, 0.999969F, 0.999951F, 0.999943F, 0.99994F, 0.999939F, 0.999939F, 0.999939F},
      {1.0F, 1.0F, 1.0F, 1.0F, 0.999998F, 0.999994F, 0.999985F, 0.999976F, 0.999971F, 0.99997F, 0.99997F, 0.99997F, 0.999969F},
      {1.0F, 1.0F, 1.0F, 1.0F, 0.999999F, 0.999997F, 0.999992F, 0.999988F, 0.999986F, 0.999985F, 0.999985F, 0.999985F, 0.999985F},
      {1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.999998F, 0.999996F, 0.999994F, 0.999993F, 0.999992F, 0.999992F, 0.999992F, 0.999992F},
      {1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.999999F, 0.999998F, 0.999997F, 0.999996F, 0.999996F, 0.999996F, 0.999996F, 0.999996F},
      {1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.999999F, 0.999998F, 0.999998F, 0.999998F, 0.999998F, 0.999998F, 0.999998F},
      {1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.999999F, 0.999999F, 0.999999F, 0.999999F, 0.999999F, 0.999999F},
      {1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F},
      {1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F},
      {1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F}
   };
   private static final float[][] field_28689 = new float[][]{
      {
            0.00775382F,
            0.00775945F,
            0.00778198F,
            0.00787211F,
            0.00823245F,
            0.00967118F,
            0.0153846F,
            0.037594F,
            0.117241F,
            0.336788F,
            0.667532F,
            0.888985F,
            0.969704F
      },
      {0.0153883F, 0.0153994F, 0.0154438F, 0.0156212F, 0.0163305F, 0.0191571F, 0.030303F, 0.0724638F, 0.209877F, 0.503876F, 0.800623F, 0.94123F, 0.984619F},
      {0.0303102F, 0.0303317F, 0.0304178F, 0.0307619F, 0.0321361F, 0.037594F, 0.0588235F, 0.135135F, 0.346939F, 0.670103F, 0.889273F, 0.969726F, 0.99225F},
      {0.058837F, 0.0588776F, 0.0590397F, 0.0596878F, 0.0622711F, 0.0724638F, 0.111111F, 0.238095F, 0.515152F, 0.802469F, 0.941392F, 0.98463F, 0.99611F},
      {0.111135F, 0.111208F, 0.111497F, 0.112652F, 0.117241F, 0.135135F, 0.2F, 0.384615F, 0.68F, 0.890411F, 0.969811F, 0.992256F, 0.998051F},
      {0.200039F, 0.200156F, 0.200625F, 0.202492F, 0.209877F, 0.238095F, 0.333333F, 0.555556F, 0.809524F, 0.942029F, 0.984674F, 0.996113F, 0.999025F},
      {0.333388F, 0.33355F, 0.3342F, 0.336788F, 0.346939F, 0.384615F, 0.5F, 0.714286F, 0.894737F, 0.970149F, 0.992278F, 0.998053F, 0.999512F},
      {0.500061F, 0.500244F, 0.500975F, 0.503876F, 0.515152F, 0.555556F, 0.666667F, 0.833333F, 0.944444F, 0.984848F, 0.996124F, 0.999025F, 0.999756F},
      {0.666721F, 0.666884F, 0.667532F, 0.670103F, 0.68F, 0.714286F, 0.8F, 0.909091F, 0.971429F, 0.992366F, 0.998058F, 0.999512F, 0.999878F},
      {0.800039F, 0.800156F, 0.800623F, 0.802469F, 0.809524F, 0.833333F, 0.888889F, 0.952381F, 0.985507F, 0.996169F, 0.999028F, 0.999756F, 0.999939F},
      {0.888913F, 0.888985F, 0.889273F, 0.890411F, 0.894737F, 0.909091F, 0.941176F, 0.97561F, 0.992701F, 0.998081F, 0.999514F, 0.999878F, 0.999969F},
      {0.94119F, 0.94123F, 0.941392F, 0.942029F, 0.944444F, 0.952381F, 0.969697F, 0.987654F, 0.996337F, 0.999039F, 0.999757F, 0.999939F, 0.999985F},
      {0.969704F, 0.969726F, 0.969811F, 0.970149F, 0.971429F, 0.97561F, 0.984615F, 0.993789F, 0.998165F, 0.999519F, 0.999878F, 0.99997F, 0.999992F},
      {0.984619F, 0.98463F, 0.984674F, 0.984848F, 0.985507F, 0.987654F, 0.992248F, 0.996885F, 0.999082F, 0.99976F, 0.999939F, 0.999985F, 0.999996F},
      {0.99225F, 0.992256F, 0.992278F, 0.992366F, 0.992701F, 0.993789F, 0.996109F, 0.99844F, 0.999541F, 0.99988F, 0.99997F, 0.999992F, 0.999998F},
      {0.99611F, 0.996113F, 0.996124F, 0.996169F, 0.996337F, 0.996885F, 0.998051F, 0.999219F, 0.99977F, 0.99994F, 0.999985F, 0.999996F, 0.999999F},
      {0.998051F, 0.998053F, 0.998058F, 0.998081F, 0.998165F, 0.99844F, 0.999024F, 0.99961F, 0.999885F, 0.99997F, 0.999992F, 0.999998F, 1.0F},
      {0.999025F, 0.999025F, 0.999028F, 0.999039F, 0.999082F, 0.999219F, 0.999512F, 0.999805F, 0.999943F, 0.999985F, 0.999996F, 0.999999F, 1.0F},
      {0.999512F, 0.999512F, 0.999514F, 0.999519F, 0.999541F, 0.99961F, 0.999756F, 0.999902F, 0.999971F, 0.999992F, 0.999998F, 1.0F, 1.0F},
      {0.999756F, 0.999756F, 0.999757F, 0.99976F, 0.99977F, 0.999805F, 0.999878F, 0.999951F, 0.999986F, 0.999996F, 0.999999F, 1.0F, 1.0F},
      {0.999878F, 0.999878F, 0.999878F, 0.99988F, 0.999885F, 0.999902F, 0.999939F, 0.999976F, 0.999993F, 0.999998F, 1.0F, 1.0F, 1.0F},
      {0.999939F, 0.999939F, 0.999939F, 0.99994F, 0.999943F, 0.999951F, 0.999969F, 0.999988F, 0.999996F, 0.999999F, 1.0F, 1.0F, 1.0F},
      {0.999969F, 0.99997F, 0.99997F, 0.99997F, 0.999971F, 0.999976F, 0.999985F, 0.999994F, 0.999998F, 1.0F, 1.0F, 1.0F, 1.0F},
      {0.999985F, 0.999985F, 0.999985F, 0.999985F, 0.999986F, 0.999988F, 0.999992F, 0.999997F, 0.999999F, 1.0F, 1.0F, 1.0F, 1.0F},
      {0.999992F, 0.999992F, 0.999992F, 0.999992F, 0.999993F, 0.999994F, 0.999996F, 0.999998F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F},
      {0.999996F, 0.999996F, 0.999996F, 0.999996F, 0.999996F, 0.999997F, 0.999998F, 0.999999F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F},
      {0.999998F, 0.999998F, 0.999998F, 0.999998F, 0.999998F, 0.999998F, 0.999999F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F},
      {0.999999F, 0.999999F, 0.999999F, 0.999999F, 0.999999F, 0.999999F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F},
      {1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F},
      {1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F},
      {1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F}
   };
   private static final float[] field_28688 = new float[]{
      2.44081E-4F,
      4.88043E-4F,
      9.7561E-4F,
      0.00194932F,
      0.00389105F,
      0.00775194F,
      0.0153846F,
      0.030303F,
      0.0588235F,
      0.111111F,
      0.2F,
      0.333333F,
      0.5F,
      0.666667F,
      0.8F,
      0.888889F,
      0.941176F,
      0.969697F,
      0.984615F,
      0.992248F,
      0.996109F,
      0.998051F,
      0.999024F,
      0.999512F,
      0.999756F
   };

   public static void method_25616(class_8470 var0, int var1) {
      for (int var4 = 0; var4 < var0.field_43378[var1]; var4++) {
         if (var0.field_43325[var1][var4] != 0) {
            int var6 = var4 != 0 ? var0.field_43357[var1][var4 - 1] : var0.field_43289[var1];
            if (var0.field_43357[var1][var4] == var6) {
               for (int var11 = 0; var11 < var0.field_43362[var0.field_43357[var1][var4]]; var11++) {
                  int var13;
                  if (var4 != 0) {
                     var13 = var0.field_43383[var1][var11][var4 - 1];
                  } else {
                     var13 = var0.field_43337[var1][var11];
                  }

                  var0.field_43383[var1][var11][var4] = var13 + var0.field_43383[var1][var11][var4];
               }
            } else if (var6 == 1 && var0.field_43357[var1][var4] == 0) {
               for (int var10 = 0; var10 < var0.field_43362[var0.field_43357[var1][var4]]; var10++) {
                  for (int var14 = 0; var14 < var0.field_43390; var14++) {
                     if (var0.field_43347[1][var14] == var0.field_43347[0][var10]) {
                        int var12;
                        if (var4 != 0) {
                           var12 = var0.field_43383[var1][var14][var4 - 1];
                        } else {
                           var12 = var0.field_43337[var1][var14];
                        }

                        var0.field_43383[var1][var10][var4] = var12 + var0.field_43383[var1][var10][var4];
                     }
                  }
               }
            } else if (var6 == 0 && var0.field_43357[var1][var4] == 1) {
               for (int var9 = 0; var9 < var0.field_43362[var0.field_43357[var1][var4]]; var9++) {
                  for (int var8 = 0; var8 < var0.field_43302; var8++) {
                     if (var0.field_43347[0][var8] <= var0.field_43347[1][var9] && var0.field_43347[1][var9] < var0.field_43347[0][var8 + 1]) {
                        int var7;
                        if (var4 != 0) {
                           var7 = var0.field_43383[var1][var8][var4 - 1];
                        } else {
                           var7 = var0.field_43337[var1][var8];
                        }

                        var0.field_43383[var1][var9][var4] = var7 + var0.field_43383[var1][var9][var4];
                     }
                  }
               }
            }
         } else {
            for (int var5 = 1; var5 < var0.field_43362[var0.field_43357[var1][var4]]; var5++) {
               var0.field_43383[var1][var5][var4] = var0.field_43383[var1][var5 - 1][var4] + var0.field_43383[var1][var5][var4];
               if (var0.field_43383[var1][var5][var4] < 0) {
                  var0.field_43383[var1][var5][var4] = 0;
               }
            }
         }
      }
   }

   public static void method_25613(class_8470 var0, int var1) {
      for (int var4 = 0; var4 < var0.field_43312[var1]; var4++) {
         if (var0.field_43370[var1][var4] != 0) {
            if (var4 != 0) {
               for (int var7 = 0; var7 < var0.field_43353; var7++) {
                  var0.field_43323[var1][var7][var4] = var0.field_43323[var1][var7][var4 - 1] + var0.field_43323[var1][var7][var4];
               }
            } else {
               for (int var6 = 0; var6 < var0.field_43353; var6++) {
                  var0.field_43323[var1][var6][var4] = var0.field_43331[var1][var6] + var0.field_43323[var1][var6][0];
               }
            }
         } else {
            for (int var5 = 1; var5 < var0.field_43353; var5++) {
               var0.field_43323[var1][var5][var4] = var0.field_43323[var1][var5][var4] + var0.field_43323[var1][var5 - 1][var4];
            }
         }
      }
   }

   public static float method_25615(class_8470 var0, int var1, int var2, int var3) {
      if (!var0.field_43373) {
         return var0.field_43323[var1][var2][var3] >= 0 && var0.field_43323[var1][var2][var3] <= 30 ? field_28694[var0.field_43323[var1][var2][var3]] : 0.0F;
      } else if (var0.field_43323[0][var2][var3] < 0
         || var0.field_43323[0][var2][var3] > 30
         || var0.field_43323[1][var2][var3] < 0
         || var0.field_43323[1][var2][var3] > 24) {
         return 0.0F;
      } else {
         return var1 != 0
            ? field_28689[var0.field_43323[0][var2][var3]][var0.field_43323[1][var2][var3] >> 1]
            : field_28693[var0.field_43323[0][var2][var3]][var0.field_43323[1][var2][var3] >> 1];
      }
   }

   public static float method_25612(class_8470 var0, int var1, int var2, int var3) {
      if (!var0.field_43373) {
         return var0.field_43323[var1][var2][var3] >= 0 && var0.field_43323[var1][var2][var3] <= 30 ? field_28687[var0.field_43323[var1][var2][var3]] : 0.0F;
      } else if (var0.field_43323[0][var2][var3] < 0
         || var0.field_43323[0][var2][var3] > 30
         || var0.field_43323[1][var2][var3] < 0
         || var0.field_43323[1][var2][var3] > 24) {
         return 0.0F;
      } else {
         return var1 != 0
            ? field_28692[var0.field_43323[0][var2][var3]][var0.field_43323[1][var2][var3] >> 1]
            : field_28691[var0.field_43323[0][var2][var3]][var0.field_43323[1][var2][var3] >> 1];
      }
   }

   public static void method_25617(class_8470 var0, int var1) {
      if (!var0.field_43373) {
         int var4 = !var0.field_43401[var1] ? 1 : 0;

         for (int var5 = 0; var5 < var0.field_43378[var1]; var5++) {
            for (int var6 = 0; var6 < var0.field_43362[var0.field_43357[var1][var5]]; var6++) {
               int var7 = var0.field_43383[var1][var6][var5] >> var4;
               if (var7 >= 0 && var7 < 64) {
                  var0.field_43341[var1][var6][var5] = field_28695[var7];
                  if (var4 != 0 && (var0.field_43383[var1][var6][var5] & 1) != 0) {
                     var0.field_43341[var1][var6][var5] = var0.field_43341[var1][var6][var5] * 1.4142135F;
                  }
               } else {
                  var0.field_43341[var1][var6][var5] = 0.0F;
               }
            }
         }

         for (int var8 = 0; var8 < var0.field_43312[var1]; var8++) {
            for (int var9 = 0; var9 < var0.field_43353; var9++) {
               var0.field_43402[var1][var9][var8] = method_25615(var0, var1, var9, var8);
               var0.field_43335[var1][var9][var8] = method_25612(var0, var1, var9, var8);
            }
         }
      }
   }

   public static void method_25614(class_8470 var0) {
      int var3 = !var0.field_43401[0] ? 1 : 0;
      int var4 = !var0.field_43401[1] ? 1 : 0;

      for (int var5 = 0; var5 < var0.field_43378[0]; var5++) {
         for (int var6 = 0; var6 < var0.field_43362[var0.field_43357[0][var5]]; var6++) {
            int var7 = (var0.field_43383[0][var6][var5] >> var3) + 1;
            int var8 = var0.field_43383[1][var6][var5] >> var4;
            if (var7 >= 0 && var7 < 64 && var8 >= 0 && var8 <= 24) {
               float var9 = field_28695[var7];
               if (var3 != 0 && (var0.field_43383[0][var6][var5] & 1) != 0) {
                  var9 = (float)((double)var9 * 1.414213562);
               }

               var0.field_43341[0][var6][var5] = var9 * field_28688[var8];
               var0.field_43341[1][var6][var5] = var9 * field_28688[24 - var8];
            } else {
               var0.field_43341[1][var6][var5] = 0.0F;
               var0.field_43341[0][var6][var5] = 0.0F;
            }
         }
      }

      for (int var10 = 0; var10 < var0.field_43312[0]; var10++) {
         for (int var11 = 0; var11 < var0.field_43353; var11++) {
            var0.field_43402[0][var11][var10] = method_25615(var0, 0, var11, var10);
            var0.field_43402[1][var11][var10] = method_25615(var0, 1, var11, var10);
            var0.field_43335[0][var11][var10] = method_25612(var0, 0, var11, var10);
            var0.field_43335[1][var11][var10] = method_25612(var0, 1, var11, var10);
         }
      }
   }
}
